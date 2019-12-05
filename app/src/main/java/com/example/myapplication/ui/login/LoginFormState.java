package com.example.myapplication.ui.login;

import androidx.annotation.Nullable;

/**
 * Data validation state of the login form.
 * 登录表单的数据验证状态.
 */
class LoginFormState {

    /**
     * 用户名错误状态.
     */
    @Nullable
    private Integer usernameError;

    /**
     * 密码错误状态
     */
    @Nullable
    private Integer passwordError;

    /**
     * 数据是否有效
     */
    private boolean isDataValid;

    LoginFormState(@Nullable Integer usernameError, @Nullable Integer passwordError) {
        this.usernameError = usernameError;
        this.passwordError = passwordError;
        this.isDataValid = false;
    }

    LoginFormState(boolean isDataValid) {
        this.usernameError = null;
        this.passwordError = null;
        this.isDataValid = isDataValid;
    }

    @Nullable
    Integer getUsernameError() {
        return usernameError;
    }

    @Nullable
    Integer getPasswordError() {
        return passwordError;
    }

    boolean isDataValid() {
        return isDataValid;
    }
}