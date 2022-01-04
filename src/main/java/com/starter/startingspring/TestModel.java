package com.starter.startingspring;

public class TestModel {
    private Long webId;
    private String test;

    public TestModel(Long webId, String test) {
        this.webId = webId;
        this.test = test;
    }

    public Long getWebId() {
        return webId;
    }

    public void setWebId(Long webId) {
        this.webId = webId;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
