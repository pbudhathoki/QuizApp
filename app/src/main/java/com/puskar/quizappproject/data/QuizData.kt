package com.puskar.quizappproject.data

import com.puskar.quizappproject.constants.Constant.IS_CONTROL_CHECK_BOX
import com.puskar.quizappproject.constants.Constant.IS_CONTROL_RADIO_BUTTON

class QuizData {

    companion object {
        fun getAppQuestions(): MutableList<Quiz> {
            return mutableListOf(
                Quiz(
                    1,
                    "1. What is an activity in android?",
                    IS_CONTROL_RADIO_BUTTON,
                    "A activity is a single screen in an application.",
                    "c",
                    "a single screen in application supporting java code",
                    "",
                    "",
                    mutableListOf("android class","android package", "a single screen in application supporting java code", "None of the above")
                ),
                Quiz(
                    2,
                    "2. State whether true or false:  Android is built upon the Java micro edition(J2ME) version of Java.",
                    IS_CONTROL_RADIO_BUTTON,
                    "Android is not built upon the Java micro edition(J2ME) version of Java.",
                    "b",
                    "False",
                    "",
                    "",
                    mutableListOf("True","False")
                ),
                Quiz(
                    3,
                    "3. Among the following options choose the one for which Android is based on Linux.",
                    IS_CONTROL_RADIO_BUTTON,
                    "All of the above are reasons for which Android is based on Linux.",
                    "d",
                    "All of the above",
                    "",
                    "",
                    mutableListOf("Networking","Portability","Security","All of the above")
                ),
                Quiz(
                    4,
                    "4. Which of the following virtual machine is used by the Android operating system?",
                    IS_CONTROL_RADIO_BUTTON,
                    "The Dalvik Virtual Machine (DVM) is an android virtual machine optimized for mobile devices. It optimizes the virtual machine for memory, battery life, and performance.",
                    "b",
                    "Dalvik virtual machine",
                    "",
                    "",
                    mutableListOf("JVM","Dalvik virtual machine","Simple virtual machine","None of the above")
                ),
                Quiz(
                    5,
                    "5.All layout classes are the subclasses of",
                    IS_CONTROL_RADIO_BUTTON,
                    "all layout classes are the subclasses of android.view.ViewGroup in android.",
                    "c",
                    "android.view.ViewGroup",
                    "",
                    "",
                    mutableListOf("android.widget","android.view.View","android.view.ViewGroup","None")
                ),
                Quiz(
                    6,
                    "6. What is manifest XML in android?",
                    IS_CONTROL_RADIO_BUTTON,
                    "It has all the information about an application.",
                    "b",
                    "It has all the information about an application",
                    "",
                    "",
                    mutableListOf("It has information about layout in an application","It has all the information about an application","It has the information about activities in an application","None")
                ),
                Quiz(
                    7,
                    "7. In android, mini activities are also known as",
                    IS_CONTROL_RADIO_BUTTON,
                    "In android, mini activities are also known as Fragments",
                    "c",
                    "Fragments",
                    "",
                    "",
                    mutableListOf("Adapter","Activity","Fragments", "None")
                ),
                Quiz(
                    8,
                    "8. Among the following choose the one which converts Java bytecode into Dalvik bytecode",
                    IS_CONTROL_RADIO_BUTTON,
                    "dex compiler converts convert JAVA bytecode into Dalvik bytecode.",
                    "a",
                    "dex compiler",
                    "",
                    "",
                    mutableListOf("dex compiler","Mobile interpretive compare","Dalvik Converter", "None")
                ),
                Quiz(
                    9,
                    "9. On which of the following, developers can test the application, during developing the android applications?",
                    IS_CONTROL_CHECK_BOX,
                    "We can use the Android emulator, physical android phone, or third-party emulator as a target device to execute and test our Android application.",
                    "abc",
                    "Third-party emulators\nEmulator included in Android SDK\nPhysical android phone",
                    "",
                    "",
                    mutableListOf("Third-party emulators","Emulator included in Android SDK","Physical android phone")
                ),
                Quiz(
                    10,
                    "10. AVD stands for",
                    IS_CONTROL_RADIO_BUTTON,
                    "AVD stands for Android virtual device",
                    "c",
                    "Android Virtual Device",
                    "",
                    "",
                    mutableListOf("Active Virtual Display","Android Virtual Display","Android Virtual Device","Active Virtual Device")
                ),
                Quiz(
                    11,
                    "11. Activity in Android can be killed using?",
                    IS_CONTROL_CHECK_BOX,
                    "Activity in Android can be killed using both finishActivity (int requestCode) and finish() method.",
                    "ab",
                    "finishActivity (int requestCode)\nfinish() method",
                    "",
                    "",
                    mutableListOf("finishActivity (int requestCode)","finish() method","neither a and b", "None")
                ),
                Quiz(
                    12,
                    "12. Choose the option which is contained in the src folder",
                    IS_CONTROL_RADIO_BUTTON,
                    "Java source code is contained in the src folder",
                    "a",
                    "Java source code",
                    "",
                    "",
                    mutableListOf("Java source code","Manifest","XML","None")
                ),
                Quiz(
                    13,
                    "13. Identify the lowest layer of Android architecture.",
                    IS_CONTROL_RADIO_BUTTON,
                    "Linux kernel Is the lowest layer of Android architecture.",
                    "c",
                    "Linux Kernel",
                    "",
                    "",
                    mutableListOf("Applications","Applications framework","Linux Kernel","System libraries and android runtime ")
                ),
                Quiz(
                    14,
                    "14. Identify the dialogue class in Android among the following",
                    IS_CONTROL_CHECK_BOX,
                    "All of the above are dialogue classes in Android.",
                    "abc",
                    "DatePicker Dialog\nAlertDialog\nProgressDialog",
                    "",
                    "",
                    mutableListOf("DatePicker Dialog","AlertDialog","ProgressDialog")
                ),
                Quiz(
                    15,
                    "15. Choose the built-in database of Android.",
                    IS_CONTROL_RADIO_BUTTON,
                    "SQLite Is the built-in database of Android.",
                    "b",
                    "SQLite",
                    "",
                    "",
                    mutableListOf("MySQL","SQLite","Oracle","None")
                )
            )
        }
    }
}