Experiment2 项目说明

本项目是一个基于 Android Studio 的多界面综合实验应用，主要用于学习和练习 Activity 的使用、布局管理、菜单功能、事件响应以及界面交互等基础开发内容。

一、项目简介

Experiment2 项目通过四个功能界面的设计，展示了 Android 中的不同交互方式和布局方法，包括：

1. GridLinearActivity：网格与线性布局的对比与结合使用。
2. MenuActivity：菜单定义与事件响应。
3. CalculatorActivity：简易计算器的实现。
4. TravelActivity：旅行预订界面交互与控件综合运用。

二、技术说明

Java：用于逻辑编写与事件处理  
XML：用于界面布局与控件定义  
Android Studio：项目开发与调试环境  
Intent：实现页面跳转与数据传递  
Menu API：菜单功能与点击事件处理  
Layout 组件：LinearLayout、GridLayout 等布局设计

三、功能界面展示

1. GridLinearActivity  
该界面展示了 GridLayout 与 LinearLayout 的组合与对比，主要用于理解布局嵌套、组件对齐方式与屏幕适配。  
功能要点包括：水平与垂直布局嵌套、动态排列按钮、控件间距与权重分配。

图片展示：  
https://raw.githubusercontent.com/Ccx505/Experiment2/master/GridLinearActivity.png

2. MenuActivity  
该界面演示了 Android 的菜单创建与事件响应机制。用户点击菜单选项后会触发相应操作并显示提示。  
功能要点包括：创建选项菜单、响应菜单项点击、使用 Toast 显示反馈信息。

图片展示：  
https://raw.githubusercontent.com/Ccx505/Experiment2/master/MenuActivity.png

3. CalculatorActivity  
这是一个简易计算器界面，演示了控件交互与事件监听的实现方式。用户可通过按钮进行加减乘除等运算。  
功能要点包括：实现四则运算、实时显示输入与结果、清除按钮与错误处理。

图片展示：  
https://raw.githubusercontent.com/Ccx505/Experiment2/master/CalculatorActivity.png

4. TravelActivity  
该界面模拟旅行应用的预订流程，通过控件组合展示了 Switch、DatePickerDialog、输入框等组件的交互使用。  
功能要点包括：单程与往返模式切换、日期选择器、出发与到达输入、提交与反馈显示。

图片展示：  
https://raw.githubusercontent.com/Ccx505/Experiment2/master/TravelActivity.png

四、项目结构

Experiment2/
  app/
    src/
      main/java/com/example/experiment2/
        CalculatorActivity.java
        MenuActivity.java
        GridLinearActivity.java
        TravelActivity.java
      main/res/layout/
        activity_calculator.xml
        activity_menu.xml
        activity_grid_linear.xml
        activity_travel.xml
    AndroidManifest.xml
  build.gradle

五、学习总结

GridLinearActivity：布局管理（LinearLayout 与 GridLayout 的组合使用）  
MenuActivity：菜单功能（onCreateOptionsMenu、onOptionsItemSelected）  
CalculatorActivity：控件交互（按钮事件监听、文本更新、输入处理）  
TravelActivity：表单交互（Switch、DatePickerDialog、输入验证）
