package com.callub.controller;

import com.callub.model.Task;
import com.callub.model.TaskPriority;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class MainController {

    @FXML
    private ListView<Task> taskListView;

    private final ObservableList<Task> tasks = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        taskListView.setItems(tasks);
    }

    @FXML
    private void addTask() {
        Task task = new Task("New Task", "", TaskPriority.MEDIUM, null);
        tasks.add(task);
    }

    @FXML
    private void deleteSelectedTask() {
        Task selectedTask = taskListView.getSelectionModel().getSelectedItem();

        if (selectedTask != null) {
            tasks.remove(selectedTask);
        }
    }
}