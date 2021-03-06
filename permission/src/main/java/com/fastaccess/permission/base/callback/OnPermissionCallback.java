package com.fastaccess.permission.base.callback;

public interface OnPermissionCallback {

    void onPermissionGranted(String[] permissionName);

    void onPermissionDeclined(String[] permissionName);

    void onPermissionPreGranted(String permissionsName);

    void onPermissionNeedExplanation(String permissionName);

    void onPermissionReallyDeclined(String permissionName);

    void onNoPermissionNeeded();
}
