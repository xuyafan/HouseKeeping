package nju.xyf.service;

import nju.dao.*;
import nju.model.*;
import nju.xyf.request.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderDao mOrderDao;

    @Autowired
    StaffDao mStaffDao;

    @Autowired
    LocationDao mLocationDao;

    @Autowired
    MessageDao mMessageDao;

    @Autowired
    ServiceDao mServiceDao;

    @Autowired
    UserDao mUserDao;

    @Autowired
    RatingDao mRatingDao;

    @Autowired
    CommentDao mCommentDao;

    public OrderData order(Order order) {
        OrderData orderData = new OrderData();
        orderData.setUserId(order.getUserId());
        orderData.setStaffId(order.getStaffId());
        orderData.setLocationId(order.getLocationId());
        orderData.setOrderType(order.getOrderType());
        //condition
        orderData.setServiceType(order.getOrderCondition().getType());
        orderData.setStartDate(order.getOrderCondition().getStartDate());
        orderData.setEndDate(order.getOrderCondition().getEndDate());
        return mOrderDao.save(orderData);
    }

    public List<StaffData> getStaffListByCondition(OrderCondition condition) {
        List<StaffData> result = new ArrayList<>();
        List<StaffData> allStaff = mStaffDao.findAll();
        //TODO :筛选
        return allStaff;
    }

    public List<Order> getOrderList(int userId) {
        List<Order> result = new ArrayList<>();
        List<OrderData> orderDataList = mOrderDao.findAllByUserId(userId);
        for (OrderData orderData : orderDataList) {
            Order order = new Order();
            order.setId(orderData.getId());
            order.setUserId(orderData.getUserId());
            order.setLocationId(orderData.getLocationId());
            order.setLocation(new Location(mLocationDao.findOne(orderData.getLocationId())));
            order.setStaffId(orderData.getStaffId());
            order.setStaff(new Staff(mStaffDao.findOne(orderData.getStaffId())));
            order.setOrderType(orderData.getOrderType());
            order.setOrderCondition(new OrderCondition(orderData.getServiceType(), orderData.getStartDate(), orderData.getEndDate()));
            result.add(order);
        }
        return result;
    }

    public void cancelOrder(int orderId) {
        mOrderDao.delete(orderId);
    }

    public OrderData confirmOrder(int orderId) {

        OrderData orderData = mOrderDao.findOne(orderId);
        orderData.setOrderType(Order.ORDER_TYPE_ON);
        return mOrderDao.save(orderData);

    }

    public List<Message> getMessageList(int orderId) {
        List<Message> result = new ArrayList<>();
        List<MessageData> messageDataList = mMessageDao.findAllByOrderId(orderId);
        if (messageDataList.size() <= 0) {
            //不存在对话，创建一个客服的询问句
            MessageData messageData = new MessageData();
            //这里我们都是通过客服1来询问
            messageData.setServiceId(1);
            messageData.setUserId(0);
            messageData.setOrderId(orderId);
            messageData.setContent("请问您有什么问题吗？");
            messageData.setDatetime(new Date().getTime());
            mMessageDao.save(messageData);
            messageDataList.add(messageData);
        }

        //对messageDataList的补充
        for (MessageData messageData : messageDataList) {

            Message message = new Message(messageData);
            if (messageData.getServiceId() != 0) {
                ServiceData serviceData = mServiceDao.findOne(messageData.getServiceId());
                message.setService(new nju.xyf.request.Service(serviceData));
            }
            if (messageData.getUserId() != 0) {
                UserData userData = mUserDao.findOne(messageData.getUserId());
                message.setUser(new User(userData));
            }
            result.add(message);
        }

        return result;
    }

    public Message sendMessage(MessageData messageData) {
        mMessageDao.save(messageData);

        Message message = new Message(messageData);
        if (messageData.getServiceId() != 0) {
            ServiceData serviceData = mServiceDao.findOne(messageData.getServiceId());
            message.setService(new nju.xyf.request.Service(serviceData));
        }
        if (messageData.getUserId() != 0) {
            UserData userData = mUserDao.findOne(messageData.getUserId());
            message.setUser(new User(userData));
        }

        return message;
    }

    public Rating rating(RatingData ratingData) {
        RatingData data = mRatingDao.save(ratingData);
        Rating rating = new Rating(data);
        rating.setUser(new User(mUserDao.findOne(data.getUserId())));
        return rating;
    }

    public Rating getRating(int orderId) {
        RatingData data = mRatingDao.findByOrderId(orderId);
        if (data != null) {
            Rating rating = new Rating(data);
            rating.setUser(new User(mUserDao.findOne(data.getUserId())));
            return rating;
        } else {
            return null;
        }

    }

    public List<Date> getInOrderTime(int staffId) {
        List<Date> result = new ArrayList<>();
        List<OrderData> orderDataList = mOrderDao.findAllByStaffId(staffId);
        for (OrderData orderData : orderDataList) {
            Date start = new Date(orderData.getStartDate());
            Date end = new Date(orderData.getEndDate());
            result.addAll(getDatesBetweenTwoDate(start, end));
        }
        return result;
    }

    private static List<Date> getDatesBetweenTwoDate(Date beginDate, Date endDate) {
        List<Date> lDate = new ArrayList<Date>();
        lDate.add(beginDate);// 把开始时间加入集合
        Calendar cal = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        cal.setTime(beginDate);
        while (true) {
            // 根据日历的规则，为给定的日历字段添加或减去指定的时间量
            cal.add(Calendar.DAY_OF_MONTH, 1);
            // 测试此日期是否在指定日期之后
            if (endDate.after(cal.getTime())) {
                lDate.add(cal.getTime());
            } else {
                break;
            }
        }
        lDate.add(endDate);// 把结束时间加入集合
        return lDate;
    }

    public List<Comment> getCommentList(int staffId) {
        List<Comment> result = new ArrayList<>();
        List<CommentData> commentDataList = mCommentDao.findAllByStaffId(staffId);
        for (CommentData data : commentDataList) {
            Comment comment = new Comment(data);
            comment.setUser(new User(mUserDao.findOne(data.getUserId())));
            result.add(comment);
        }
        return result;
    }

    public CommentData comment(Comment comment) {
        CommentData data = new CommentData();
        data.setContext(comment.getContext());
        data.setDatetime(comment.getDatetime());
        data.setStaffId(comment.getStaffId());
        data.setUserId(comment.getUserId());
        return mCommentDao.save(data);
    }

}
