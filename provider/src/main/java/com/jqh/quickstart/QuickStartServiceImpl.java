package com.jqh.quickstart;

import com.jqh.ServiceAPI;

public class QuickStartServiceImpl implements ServiceAPI {
    @Override
    public String sendMessage(String message) {
        return "quick-start-provide-message=" + message ;
    }
}
