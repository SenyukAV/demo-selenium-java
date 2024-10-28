package com.netflix;

public class LoginMessage {
    public final static String TEXT_ERROR_NO_EMAIL = "Укажите действительный адрес электронной почты или номер телефона.";
    public final static String TEXT_ERROR_NO_PASSWORD = "Пароль должен содержать от 4 до 60 символов.";
    public final static String TEXT_ERROR_INPUT_PASSWORD_EMAIL = "Неверный пароль для " + LoginPage.email + "\n" +
            "Вы можете использовать код для входа, сбросить пароль или повторить попытку.";
}
