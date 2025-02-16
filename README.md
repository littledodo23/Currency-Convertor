# Currency-Convertor
An app programmed in kotlin that converts currency fragments, landscapes, and dialog

## Overview

Currency Converter is a simple Android application that converts between Israeli Shekel (ILS) and US Dollar (USD). The app also notifies the user if the converted amount equals 2000 USD.

## Features

Convert ILS to USD and vice versa.

Displays the converted amount in a dialog.

Sends a notification if the converted amount equals 2000 USD.

## Technologies Used

Kotlin (Android development language)

Android SDK

Android Fragments

Notifications (NotificationManager, NotificationChannel)

AlertDialog for user input

## UI Design

The app follows a fragment-based architecture, making it modular and easy to navigate:

Main Activity (activity_main.xml): Contains buttons to navigate to different sections of the app.

Convert Fragment (fragment_convert.xml): Handles currency conversion between ILS and USD.

Custom Dialog (custom_dialog.xml): Provides an input field for users to enter the amount they want to convert.

About Fragment (fragment_about2.xml): Displays information about currency exchange with support for multiple languages (English and Arabic).

The use of Fragments ensures a smooth and structured user experience, making it easy to integrate future extensions.



