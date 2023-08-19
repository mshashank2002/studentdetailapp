<?xml version="1.0" encoding="utf-8"?>
<AbsoluteLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/img">
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_x="50dp"
        android:layout_y="20dp"
        android:text="Student Details"
        android:textSize="30sp"
        android:textColor="@color/white"/>

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_x="20dp"
        android:layout_y="110dp"
        android:text="Enter Rollno:"
        android:textSize="20sp"
        android:textColor="@color/white"/>

    <EditText
        android:id="@+id/Rollno"
        android:layout_width="187dp"
        android:layout_height="wrap_content"
        android:layout_x="175dp"
        android:layout_y="87dp"
        android:digits="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
        android:hint="Enter the roll number"
        android:inputType="number"
        android:textColorHint="@color/white"
        android:textSize="20sp" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_x="20dp"
        android:layout_y="160dp"
        android:text="Enter Name:"
        android:textSize="20sp"
        android:textColor="@color/white"/>

    <EditText
        android:id="@+id/Name"
        android:layout_width="150dp"
        android:layout_height="wrap_content"
        android:layout_x="175dp"
        android:layout_y="150dp"
        android:inputType="text"
        android:textSize="20sp"
        android:hint="Enter the name"
        android:textColorHint="@color/white"/>

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_x="20dp"
        android:layout_y="210dp"
        android:text="Enter Marks:"
        android:textSize="20sp"
        android:textColor="@color/white"/>


    <EditText
        android:id="@+id/Marks"
        android:layout_width="150dp"
        android:layout_height="wrap_content"
        android:layout_x="175dp"
        android:layout_y="200dp"
        android:inputType="number"
        android:textSize="20sp"
        android:hint="Enter the marks"
        android:textColorHint="@color/white"/>


    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_x="20dp"
        android:layout_y="261dp"
        android:text="Enter Marks2:"
        android:textColor="@color/white"
        android:textSize="20sp" />

    <EditText
        android:id="@+id/Marks2"
        android:layout_width="150dp"
        android:layout_height="wrap_content"
        android:layout_x="182dp"
        android:layout_y="253dp"
        android:hint="Enter the marks"
        android:inputType="number"
        android:textColorHint="@color/white"
        android:textSize="20sp" />

    <Button
        android:id="@+id/Insert"
        android:layout_width="150dp"
        android:layout_height="wrap_content"
        android:layout_x="50dp"
        android:layout_y="308dp"
        android:background="@drawable/rounded_rectangle"
        android:text="Insert"
        android:textSize="30dp" />

    <Button
        android:id="@+id/Delete"
        android:layout_width="150dp"
        android:layout_height="wrap_content"
        android:layout_x="208dp"
        android:layout_y="306dp"
        android:background="@drawable/rounded_rectangle"
        android:text="Delete"
        android:textSize="30dp" />

    <Button
        android:id="@+id/Update"
        android:layout_width="150dp"
        android:layout_height="wrap_content"
        android:layout_x="49dp"
        android:layout_y="381dp"
        android:background="@drawable/rounded_rectangle"
        android:text="Update"
        android:textSize="30dp" />

    <Button
        android:id="@+id/View"
        android:layout_width="150dp"
        android:layout_height="wrap_content"
        android:layout_x="209dp"
        android:layout_y="380dp"
        android:background="@drawable/rounded_rectangle"
        android:text="View"
        android:textSize="30dp" />

    <Button
        android:id="@+id/ViewAll"
        android:layout_width="200dp"
        android:layout_height="wrap_content"
        android:layout_x="118dp"
        android:layout_y="450dp"
        android:background="@drawable/rounded_rectangle"
        android:text="View All"
        android:textSize="30dp" />

</AbsoluteLayout>
