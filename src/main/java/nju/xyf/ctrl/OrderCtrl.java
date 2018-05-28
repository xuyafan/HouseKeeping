package nju.xyf.ctrl;


import nju.common.ErrorCode;
import nju.common.Response;
import nju.model.*;
import nju.xyf.request.*;
import nju.xyf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@RestController
public class OrderCtrl {

    @Autowired
    OrderService orderService;


    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public String order(HttpServletRequest request,
                        @RequestBody Order order) {

        OrderData orderData = orderService.order(order);

        if (orderData != null) {
            return new Response<String>().getBuilder()
                    .succ()
                    .data("预约成功")
                    .build();
        } else {
            return new Response<Void>().getBuilder()
                    .failBuild(ErrorCode.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/staff/getListByCondition", method = RequestMethod.POST)
    public String getStaffs(HttpServletRequest request,
                            @RequestBody OrderCondition condition) {

        List<StaffData> staffList = orderService.getStaffListByCondition(condition);

        if (staffList != null) {
            return new Response<List<StaffData>>().getBuilder()
                    .succ()
                    .data(staffList)
                    .build();
        } else {
            return new Response<Void>().getBuilder()
                    .failBuild(ErrorCode.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/order/getAll", method = RequestMethod.GET)
    public String getOrders(
            @RequestParam(name = "userId") int userId) {

        List<Order> orderList = orderService.getOrderList(userId);

        if (orderList != null) {
            return new Response<List<Order>>().getBuilder()
                    .succ()
                    .data(orderList)
                    .build();
        } else {
            return new Response<Void>().getBuilder()
                    .failBuild(ErrorCode.NOT_FOUND);
        }
    }


    @RequestMapping(value = "/order/cancel", method = RequestMethod.GET)
    public String cancelOrder(
            @RequestParam(name = "orderId") int orderId) {

        orderService.cancelOrder(orderId);
        return new Response<String>().getBuilder()
                .succ()
                .data("取消订单成功")
                .build();
    }

    @RequestMapping(value = "/order/confirm", method = RequestMethod.GET)
    public String confirmOrder(
            @RequestParam(name = "orderId") int orderId) {

        OrderData orderData = orderService.confirmOrder(orderId);
        return new Response<String>().getBuilder()
                .succ()
                .data("确定订单成功")
                .build();
    }

    @RequestMapping(value = "/order/getMessageList", method = RequestMethod.GET)
    public String getMessageList(
            @RequestParam(name = "orderId") int orderId) {

        List<Message> messageList = orderService.getMessageList(orderId);

        if (messageList != null) {
            return new Response<List<Message>>().getBuilder()
                    .succ()
                    .data(messageList)
                    .build();
        } else {
            return new Response<Void>().getBuilder()
                    .failBuild(ErrorCode.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/order/sendMessage", method = RequestMethod.POST)
    public String addLocation(
            @RequestBody MessageData messageData) {

        Message result = orderService.sendMessage(messageData);
        if (result != null) {
            return new Response<Message>().getBuilder()
                    .succ()
                    .data(result)
                    .build();
        } else {
            return new Response<Void>().getBuilder()
                    .failBuild(ErrorCode.NOT_FOUND);
        }

    }

    @RequestMapping(value = "/order/rating", method = RequestMethod.POST)
    public String rating(HttpServletRequest request,
                         @RequestBody RatingData ratingData) {

        Rating rating = orderService.rating(ratingData);

        if (rating != null) {
            return new Response<Rating>().getBuilder()
                    .succ()
                    .data(rating)
                    .build();
        } else {
            return new Response<Void>().getBuilder()
                    .failBuild(ErrorCode.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/order/getRating", method = RequestMethod.GET)
    public String getRating(HttpServletRequest request,
                            @RequestParam(name = "orderId") int orderId) {

        Rating rating = orderService.getRating(orderId);

        if (rating != null) {
            return new Response<Rating>().getBuilder()
                    .succ()
                    .data(rating)
                    .build();
        } else {
            return new Response<Void>().getBuilder()
                    .failBuild(ErrorCode.NOT_FOUND);
        }
    }


    @RequestMapping(value = "/staff/getInOrderTime", method = RequestMethod.GET)
    public String getInOrderTime(HttpServletRequest request,
                                 @RequestParam(name = "staffId") int staffId) {

        List<Date> inOrderTime = orderService.getInOrderTime(staffId);

        if (inOrderTime != null) {
            return new Response<List<Date>>().getBuilder()
                    .succ()
                    .data(inOrderTime)
                    .build();
        } else {
            return new Response<Void>().getBuilder()
                    .failBuild(ErrorCode.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/staff/getCommentList", method = RequestMethod.GET)
    public String getCommentList(HttpServletRequest request,
                                 @RequestParam(name = "staffId") int staffId) {

        List<Comment> commentList = orderService.getCommentList(staffId);

        if (commentList != null) {
            return new Response<List<Comment>>().getBuilder()
                    .succ()
                    .data(commentList)
                    .build();
        } else {
            return new Response<Void>().getBuilder()
                    .failBuild(ErrorCode.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/staff/comment", method = RequestMethod.POST)
    public String comment(HttpServletRequest request,
                          @RequestBody Comment comment) {

        CommentData data = orderService.comment(comment);

        if (data != null) {
            return new Response<String>().getBuilder()
                    .succ()
                    .data("评论成功")
                    .build();
        } else {
            return new Response<Void>().getBuilder()
                    .failBuild("评论失败");
        }
    }

}
