/*
 * Copyright (c) 2024, DeepLake and/or its affiliates.
 * All rights reserved.
 * Wiatt PROPRIETARY. Use is subject to license terms.
 *
 * TEAM：DeepLake.top
 * DATE：2024年04月28日
 */
package com.cutter;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;


/**
 * TODO
 *
 * @author apure/申博-Wiatt
 * @date 2024-04-28 10:42
 */
public class ConveyorControlDemo extends Application {

    @FXML
    private ListView<String> logListView; // 获取FXML文件中ListView的引用

    @Override
    public void start(Stage primaryStage) throws Exception {
        // 加载 FXML 文件
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/main.fxml"));
        Scene scene = new Scene(root);

        // 添加样式表
        scene.getStylesheets().add(getClass().getResource("/application.css").toExternalForm());

        primaryStage.setTitle("Conveyor Control Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // 启动切菜刀
    public void startQ() {
        logListView.getItems().add("启动切菜刀");
    }

    // 启动传输带
    public void startC() {
        logListView.getItems().add("启动传输带");
    }

    // 添加【切菜刀】速度
    public void addQSpeed() {
        logListView.getItems().add("添加【切菜刀】速度");
    }


    // 减少【切菜刀】速度
    public void dimQSpeed() {
        logListView.getItems().add("减少【切菜刀】速度");
    }


    // 添加【传输带】速度
    public void addCSpeed() {
        logListView.getItems().add("添加【传输带】速度");
    }

    // 减少【传输带】速度
    public void dimCSpeed() {
        logListView.getItems().add("减少【传输带】速度");
    }

    public static void main(String[] args) {
        launch(args);
    }
}