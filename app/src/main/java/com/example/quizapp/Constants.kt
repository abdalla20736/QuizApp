package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
/*
    fun getQuestions(variant: Int): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()
        when(variant){
            1->{
                val que1 = Questions(
                    1, "Единица измерения для изменения размера элементов:",
                    R.drawable.android_question,
                    "dp", "px",
                    "pt", "sp", 1
                )
                questionsList.add(que1)
                // 2
                val que2 = Questions(
                    2, "Для чего используется система Gradle?",
                    R.drawable.android_question,
                    "Для настройки интерфейса программы Android Studio", "Для редактирования настроек проекта в режиме реального времени",
                    "Для компиляции, построения и упаковки приложений и библиотек", "Нет правильного ответа", 3
                )
                questionsList.add(que2)

                // 3
                val que3 = Questions(
                    3, "Какой метод запускает новый экземпляр компонента Activity?",
                    R.drawable.android_question,
                    "startMainActivity()", "startService()",
                    "startIntent()", "startActivity()", 4
                )
                questionsList.add(que3)

                // 4
                val que4 = Questions(
                    4, "Какое значение visibility нужно указать, чтобы View не отрисовывалась, но содержалась в разметке?",
                    R.drawable.android_question,
                    "visible", "invisible",
                    "hidden", "gone", 2
                )
                questionsList.add(que4)

                // 5
                val que5 = Questions(
                    5, "Какие веса нужно расставить на View внутри LinearLayout, чтобы они заняли 25%, 30% и 45% соответственно?",
                    R.drawable.android_question,
                    "6, 7, 9", "3, 4, 5",
                    "5, 6, 9", "4, 5, 7", 3
                )
                questionsList.add(que5)

                // 6
                val que6 = Questions(
                    6, "С помощью какого атрибута можно выравнивать дочерние элементы по центру?",
                    R.drawable.android_question,
                    "gravity = “center”", "layout_below = “center”",
                    "orientation = “center”", "layout_gravity = “center”", 1
                )
                questionsList.add(que6)

                // 7
                val que7 = Questions(
                    7, "Что значит атрибут hint в представлении EditText?",
                    R.drawable.android_question,
                    "жирный шрифт", "подчеркнутый текст",
                    "подсказка для ввода текста", "определение текста", 3
                )
                questionsList.add(que7)

                // 8
                val que8 = Questions(
                    8, "Назовите значение у атрибута inputType EditText, который автоматически исправляет вводимый текст:",
                    R.drawable.android_question,
                    "textWordCorrect", "textCorrect",
                    "textCapWords", "textAutoCorrect", 4
                )
                questionsList.add(que8)

                // 9
                val que9 = Questions(
                    9, "Назовите атрибут у ImageView, который определяет путь для загрузки изображений:",
                    R.drawable.android_question,
                    "source", "src",
                    "scr", "path", 2
                )
                questionsList.add(que9)

                // 10
                val que10 = Questions(
                    10, "Какое значение layout_height нужно указать, чтобы View было таким же по ширине, что и контейнер, в котором он находится?",
                    R.drawable.android_question,
                    "match_parent", "wrap_content",
                    "350dp", "wrap_parent", 1
                )
                questionsList.add(que10)
            }
            2->{
                val que1 = Questions(
                    1, "test",
                    R.drawable.android_question,
                    "dp", "px",
                    "pt", "sp", 1
                )
                questionsList.add(que1)
                // 2
                val que2 = Questions(
                    2, "Для чего используется система Gradle?",
                    R.drawable.android_question,
                    "Для настройки интерфейса программы Android Studio", "Для редактирования настроек проекта в режиме реального времени",
                    "Для компиляции, построения и упаковки приложений и библиотек", "Нет правильного ответа", 3
                )
                questionsList.add(que2)

                // 3
                val que3 = Questions(
                    3, "Какой метод запускает новый экземпляр компонента Activity?",
                    R.drawable.android_question,
                    "startMainActivity()", "startService()",
                    "startIntent()", "startActivity()", 4
                )
                questionsList.add(que3)

                // 4
                val que4 = Questions(
                    4, "Какое значение visibility нужно указать, чтобы View не отрисовывалась, но содержалась в разметке?",
                    R.drawable.android_question,
                    "visible", "invisible",
                    "hidden", "gone", 2
                )
                questionsList.add(que4)

                // 5
                val que5 = Questions(
                    5, "Какие веса нужно расставить на View внутри LinearLayout, чтобы они заняли 25%, 30% и 45% соответственно?",
                    R.drawable.android_question,
                    "6, 7, 9", "3, 4, 5",
                    "5, 6, 9", "4, 5, 7", 3
                )
                questionsList.add(que5)

                // 6
                val que6 = Questions(
                    6, "С помощью какого атрибута можно выравнивать дочерние элементы по центру?",
                    R.drawable.android_question,
                    "gravity = “center”", "layout_below = “center”",
                    "orientation = “center”", "layout_gravity = “center”", 1
                )
                questionsList.add(que6)

                // 7
                val que7 = Questions(
                    7, "Что значит атрибут hint в представлении EditText?",
                    R.drawable.android_question,
                    "жирный шрифт", "подчеркнутый текст",
                    "подсказка для ввода текста", "определение текста", 3
                )
                questionsList.add(que7)

                // 8
                val que8 = Questions(
                    8, "Назовите значение у атрибута inputType EditText, который автоматически исправляет вводимый текст:",
                    R.drawable.android_question,
                    "textWordCorrect", "textCorrect",
                    "textCapWords", "textAutoCorrect", 4
                )
                questionsList.add(que8)

                // 9
                val que9 = Questions(
                    9, "Назовите атрибут у ImageView, который определяет путь для загрузки изображений:",
                    R.drawable.android_question,
                    "source", "src",
                    "scr", "path", 2
                )
                questionsList.add(que9)

                // 10
                val que10 = Questions(
                    10, "Какое значение layout_height нужно указать, чтобы View было таким же по ширине, что и контейнер, в котором он находится?",
                    R.drawable.android_question,
                    "match_parent", "wrap_content",
                    "350dp", "wrap_parent", 1
                )
                questionsList.add(que10)
            }
        }

        // 1


        return questionsList
    }

 */
}