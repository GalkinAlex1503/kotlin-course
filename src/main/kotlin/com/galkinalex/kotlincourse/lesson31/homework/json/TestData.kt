package com.galkinalex.kotlincourse.lesson31.homework.json

import com.galkinalex.kotlincourse.lesson30.homework.task2ext.CharacterTypes

//Создай небольшую иерархию из сотрудников где во главе CTO.
// Это значит что в объект сотрудника с должностью CTO
// в поле списка подчинённых должны попасть пара тим лидов,
// в списке подчинённых которых есть разработчики, дизайнеры и тестировщики.
// Чтобы было немного но и была вложенность.

val qaIvan = Employee(
    "Ivan",
    true,
    "01.01.2001",
    CharacterTypes.QA,
    null
)

val qaMaria = Employee(
    "Maria",
    true,
    "02.02.2001",
    CharacterTypes.QA,
    null
)

val devJosif = Employee(
    "Josif",
    true,
    "03.03.2001",
    CharacterTypes.BACKEND_DEV,
    null
)

val devSara = Employee(
    "Sara",
    true,
    "04.04.2001",
    CharacterTypes.GAME_DEV,
    null
)

val uxMuhamed = Employee(
    "Muhamed",
    true,
    "05.05.2001",
    CharacterTypes.UX_UI,
    null
)

val uxFatima = Employee(
    "Fatima",
    true,
    "06.06.2001",
    CharacterTypes.UX_UI,
    null
)

val leadPablo = Employee(
    "Pablo",
    true,
    "07.07.2002",
    CharacterTypes.TEAM_LEAD,
    listOf(qaIvan, devSara, uxMuhamed)
)

val leadAnnita = Employee(
    "Annita",
    true,
    "08.08.2002",
    CharacterTypes.TEAM_LEAD,
    listOf(qaMaria, devJosif, uxFatima)
)

val sto = Employee(
    "Izumi",
    true,
    "29.04.2000",
    CharacterTypes.CTO,
    listOf(leadAnnita, leadPablo)
)