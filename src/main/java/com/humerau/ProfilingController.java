package com.humerau;

import lombok.Getter;

@Getter
//@Setter
public class ProfilingController implements ProfilingControllerMBean {
    private boolean enabled = true;

    @Override
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
