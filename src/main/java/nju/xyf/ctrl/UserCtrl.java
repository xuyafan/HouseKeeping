package nju.xyf.ctrl;


import nju.common.ErrorCode;
import nju.common.Response;
import nju.model.LocationData;
import nju.model.StaffData;
import nju.model.StarData;
import nju.model.UserData;
import nju.xyf.request.Location;
import nju.xyf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class UserCtrl {

    @Autowired
    UserService userService;


    @RequestMapping(value = "/user/signIn", method = RequestMethod.POST)
    public String signIn(HttpServletRequest request,
                         @RequestParam(name = "username") String username,
                         @RequestParam(name = "password") String password) {


        UserData userData = userService.signIn(username, password);
        if (userData != null) {
            return new Response<UserData>().getBuilder()
                    .succ()
                    .data(userData)
                    .build();
        } else {
            return new Response<Void>().getBuilder()
                    .failBuild(ErrorCode.NOT_FOUND);
        }


    }

    @RequestMapping(value = "/user/signUp", method = RequestMethod.POST)
    public String signUp(HttpServletRequest request,
                         @RequestParam(name = "username") String username,
                         @RequestParam(name = "password") String password) {


        UserData userData = userService.signUp(username, password);
        if (userData != null) {
            return new Response<UserData>().getBuilder()
                    .succ()
                    .data(userData)
                    .build();
        } else {
            return new Response<Void>().getBuilder()
                    .failBuild(ErrorCode.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/user/setStar", method = RequestMethod.POST)
    public String setStar(@RequestParam(name = "staffId") int staffId,
                          @RequestParam(name = "userId") int userId,
                          @RequestParam(name = "starTime") long starTime,
                          @RequestParam(name = "isStar") boolean isStar) {


        StarData starData = userService.setStar(staffId, userId, starTime, isStar);
        if (starData != null) {
            return new Response<Boolean>().getBuilder()
                    .succ()
                    .data(starData.getStar())
                    .build();
        } else {
            return new Response<Boolean>().getBuilder()
                    .succ()
                    .data(false)
                    .build();
        }
    }

    @RequestMapping(value = "/user/getStar", method = RequestMethod.GET)
    public String getStar(HttpServletRequest request,
                          @RequestParam(name = "userId") int userId,
                          @RequestParam(name = "staffId") int staffId) {


        StarData starData = userService.getStar(userId, staffId);
        if (starData != null) {
            return new Response<Boolean>().getBuilder()
                    .succ()
                    .data(starData.getStar())
                    .build();
        } else {
            return new Response<Boolean>().getBuilder()
                    .succ()
                    .data(false)
                    .build();
        }
    }

    @RequestMapping(value = "/user/getStarStaffList", method = RequestMethod.GET)
    public String getStarStaffList(HttpServletRequest request,
                                   @RequestParam(name = "userId") int userId) {


        List<StaffData> starStaffList = userService.getStarStaffList(userId);
        if (starStaffList != null) {
            return new Response<List<StaffData>>().getBuilder()
                    .succ()
                    .data(starStaffList)
                    .build();
        } else {
            return new Response<Void>().getBuilder()
                    .failBuild(ErrorCode.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/user/getLocations", method = RequestMethod.GET)
    public String getLocations(
            @RequestParam(name = "userId") int userId) {


        List<LocationData> locations = userService.getLocations(userId);
        if (locations != null) {
            return new Response<List<LocationData>>().getBuilder()
                    .succ()
                    .data(locations)
                    .build();
        } else {
            return new Response<Void>().getBuilder()
                    .failBuild(ErrorCode.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/location/add", method = RequestMethod.POST)
    public String addLocation(
            @RequestBody Location location) {
        LocationData locationData = userService.addLocation(location);
        if (locationData != null) {
            return new Response<LocationData>().getBuilder()
                    .succ()
                    .data(locationData)
                    .build();
        } else {
            return new Response<Void>().getBuilder()
                    .failBuild(ErrorCode.NOT_FOUND);
        }

    }

    @RequestMapping(value = "/location/update", method = RequestMethod.POST)
    public String updateLocation(
            @RequestBody Location location) {
        LocationData locationData = userService.updateLocation(location);
        if (locationData != null) {
            return new Response<LocationData>().getBuilder()
                    .succ()
                    .data(locationData)
                    .build();
        } else {
            return new Response<Void>().getBuilder()
                    .failBuild(ErrorCode.NOT_FOUND);
        }

    }

    @RequestMapping(value = "/location/delete", method = RequestMethod.POST)
    public String deleteLocation(
            @RequestBody Location location) {
        userService.deleteLocation(location);

        return new Response<String>().getBuilder()
                .succ()
                .data("删除成功")
                .build();


    }

    @RequestMapping(value = "/user/updateUsername", method = RequestMethod.POST)
    public String updateUsername(HttpServletRequest request,
                                 @RequestParam(name = "id") int id,
                                 @RequestParam(name = "username") String username) {


        UserData userData = userService.updateUsername(id, username);
        if (userData != null) {
            return new Response<UserData>().getBuilder()
                    .succ()
                    .data(userData)
                    .build();
        } else {
            return new Response<Void>().getBuilder()
                    .failBuild(ErrorCode.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/user/updatePassword", method = RequestMethod.POST)
    public String updatePassword(HttpServletRequest request,
                                 @RequestParam(name = "id") int id,
                                 @RequestParam(name = "password") String password) {


        UserData userData = userService.updatePassword(id, password);
        if (userData != null) {
            return new Response<UserData>().getBuilder()
                    .succ()
                    .data(userData)
                    .build();
        } else {
            return new Response<Void>().getBuilder()
                    .failBuild(ErrorCode.NOT_FOUND);
        }
    }

}
