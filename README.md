# BaiMapNaviDemo
简单的百度地图定位导航小demo
需要注意的几个小问题是：
1：需要在AndroidManifest.xml文件中
<meta-data
            android:name="com.baidu.lbsapi.API_KEY"
            android:value="XaTwF3EsaGVP9PeQqGnZkWX8cHlkSlKU" />
        <service
            android:name="com.baidu.location.f"
            android:enabled="true"
            android:process=":remote">
            <intent-filter>
                <action android:name="com.baidu.location.service_v2.2"></action>
            </intent-filter>
        </service>
value中的值为自己在百度地图开放平台(http://lbsyun.baidu.com/index.php?title=androidsdk/sdkandev-download)中申请的APPKey
还要添加相关使用权限，如下所示：
    <!-- 获取运营商信息，用于支持提供运营商信息相关的接口-->
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
    <!-- 访问网络，网络定位需要上网-->
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="com.android.launcher.permission.READ_SETTINGS" />
    <uses-permission android:name="android.permission.WAKE_LOCK" />
    <!-- 这个权限用于获取wifi的获取权限，wifi信息会用来进行网络定位-->
    <uses-permission android:name="android.permission.CHANGE_WIFI_STATE" />
    <!-- 用于访问wifi网络信息，wifi信息会用于进行网络定位-->
    <uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
    <uses-permission android:name="android.permission.GET_TASKS" />
    <!-- 写入扩展存储，向扩展卡写入数据，用于写入离线定位数据-->
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
    <uses-permission android:name="android.permission.WRITE_SETTINGS" />

    <!-- SD卡读取权限，用户写入离线定位数据-->
    <uses-permission android:name="android.permission.MOUNT_UNMOUNT_FILESYSTEMS" />
    <uses-permission android:name="android.permission.BAIDU_LOCATION_SERVICE" />
    <!-- 这个权限用于进行网络定位-->
    <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
    <uses-permission android:name="android.permission.ACCES_MOCK_LOCATION" />
    <!-- 这个权限用于访问GPS定位-->
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />

    <uses-permission android:name="android.permission.ACCESS_GPS" />
    <!-- 来电消音 -->
    <uses-permission android:name="android.permission.PROCESS_OUTGOING_CALLS" />
    <uses-permission android:name="android.permission.READ_PHONE_STATE" />
    <uses-permission android:name="android.permission.MODIFY_AUDIO_SETTINGS" />
    <uses-permission android:name="android.permission.RECORD_AUDIO" />
    <!-- 摄影机 -->
    <uses-permission android:name="android.permission.CAMERA" />