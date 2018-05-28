package nju.xyf.service;

import nju.dao.LocationDao;
import nju.dao.StaffDao;
import nju.dao.StarDao;
import nju.dao.UserDao;
import nju.model.LocationData;
import nju.model.StaffData;
import nju.model.StarData;
import nju.model.UserData;
import nju.xyf.request.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao mUserDao;

    @Autowired
    StarDao mStarDao;

    @Autowired
    LocationDao mLocationDao;

    @Autowired
    StaffDao mStaffDao;

    public UserData signIn(String username, String password) {
        UserData user = mUserDao.findByUsernameAndPassword(username, password);
        if (user != null) {
            return user;
        }
        return null;
    }


    public UserData signUp(String username, String password) {
        UserData user = new UserData(username, password);
        return mUserDao.save(user);

    }

    public UserData updateUsername(int id, String username) {
        UserData one = mUserDao.findOne(id);
        one.setUsername(username);
        return mUserDao.save(one);
    }

    public UserData updatePassword(int id, String password) {
        UserData one = mUserDao.findOne(id);
        one.setPassword(password);
        return mUserDao.save(one);
    }

    public StarData setStar(int userId, int staffId, long starTime, boolean isStar) {


        StarData star = mStarDao.findByUserIdAndStaffId(userId, staffId);
        if (star == null) {
            StarData save = new StarData();
            save.setUserId(userId);
            save.setStaffId(staffId);
            save.setStarTime(starTime);
            save.setStar(isStar);
            return mStarDao.save(save);
        } else {
            star.setStar(isStar);
            return mStarDao.save(star);
        }
    }

    public StarData getStar(int userId, int staffId) {
        return mStarDao.findByUserIdAndStaffId(userId, staffId);
    }

    public List<StaffData> getStarStaffList(int userId) {
        List<StaffData> result = new ArrayList<>();
        List<StarData> starDataList = mStarDao.findAllByUserId(userId);
        for (StarData starData : starDataList) {
            if (starData.getStar()) {
                StaffData staff = mStaffDao.findOne(starData.getStaffId());
                result.add(staff);
            }
        }
        return result;
    }

    public List<LocationData> getLocations(int userId) {
        return mLocationDao.findAllByUserId(userId);
    }

    public LocationData addLocation(Location location) {
        LocationData locationData = new LocationData();
        locationData.setName(location.getName());
        locationData.setPhone(location.getPhone());
        locationData.setAddress(location.getAddress());
        locationData.setAddressDetail(location.getAddressDetail());
        locationData.setUserId(location.getUserId());
        return mLocationDao.save(locationData);
    }

    public LocationData updateLocation(Location location) {
        LocationData locationData = mLocationDao.findOne(location.getId());
        locationData.setName(location.getName());
        locationData.setPhone(location.getPhone());
        locationData.setAddress(location.getAddress());
        locationData.setAddressDetail(location.getAddressDetail());
        locationData.setUserId(location.getUserId());
        return mLocationDao.save(locationData);
    }

    public void deleteLocation(Location location) {
        mLocationDao.delete(location.getId());
    }

}
