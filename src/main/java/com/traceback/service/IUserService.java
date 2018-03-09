package com.traceback.service;

import com.traceback.common.ServerResponse;
import com.traceback.pojo.User;

/**
 * Created by 53254 on 2018/3/9 20:47 /mmal
 */
public interface IUserService {
    ServerResponse<User> login(String username, String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str, String type);

    ServerResponse selectQuestion(String username);

    ServerResponse<String> checkAnswer(String username, String question, String answer);

    ServerResponse<String> forgetResetPassword(String username, String passwordNew, String forgetToken);

    ServerResponse<String> resetPassword(String passwordOld, String passwordNew, User user);

    ServerResponse<User> updateInformation(User user);

    ServerResponse<User> getInformation(int userId);

    ServerResponse checkAdminRole(User user);
}
