# Android开发环境搭建-第一个运行程序
掌握Android开发环境的搭建基础学习！

当Android studio的gradle下载不成功时需要更改android studio的gradle构建源
将镜像源更改国内gradle镜像源

配置项目路径：Gradle/wrapper//gradle-wrapper.properties(Gradle Version）

gradle腾讯国内镜像
distributionUrl=https://mirrors.cloud.tencent.com/gradle/gradle-8.4-bin.zip

### Android studio project 文件夹项目介绍 
1. MyApplication--第一个hello应用

2. AnimalApplication --动物连连看项目

3. MusicApplication --音乐播放器界面制作项目

4. ButtonDemo1  --使用Button控件设置点击事件，分别采用二种方式。点击Button控件实现TextView控件内容的改变 
-- 使用Button控件设置点击事件
-- 使用匿名内部类方式在Activity中添加匿名内部类

5. ButtondDemo3 --接口方式。点击Button控件实现TextView控件内容的改变

6. RegisterApplication --完成注册界面的布局，点击按钮

7. ArrayAdapterApplication --使用ListView与Adapter适配器，实现要闻列表效果

8.FruitAdapterApplication --了解各种控件的使用方法，包括TextView、EditView、ImageView等，Adapter适配器水果列表。

9. ActivityApplication --Activity生命周期方法与跳转。建立第一个Activity，演示生命周期方法，在第一个界面中包含一个按钮，点击按钮以显示Intent方式打开第二个Activity。在第一个界面中包含第二个按钮，点击按钮以隐式Intent方式打开第三个Activity。

10. PhoneDialerApplication --实现拨号程序，界面效果如下，点击拨打电话实现两个模拟器之间电话拨打。

11. MonkeyPicksApplication --实现小猴子摘桃的界面。学会创建Activity；传递参数

12. FragmentdemoApplication --完成在Activity中添加Fragment，实现页面跳转fragment

13. MeituanTakeoutApplication --在仿美团外卖菜单程序中显示一个菜单界面，主要涉及了 MainActivity 的布局加载，两个 Fragment 的定义和布局文件。

14. SharedPreferencesStorageApplication --模仿登录程序界面，以SharedPreferences方式存储用户账号、密码信息，在下次打开软件时，可以在界面中显示上次登录的账号、密码

15. FileStorageLoginApplication --程序界面，增加记住密码选项。a.	用户登录验证；b.	记住密码选项被选定且登录成功，则存储用户账号、密码等信息;
c.	在下次打开软件时，可以在界面中显示上次登录成功的账号、密码；

16. Application102 --综合总结登陆界面，登陆后跳转到页面，实现FirstFragment和SecondFragment

