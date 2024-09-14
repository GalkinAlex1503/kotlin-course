package com.galkinalex.kotlincourse.lesson3


//    Название мероприятия
val nameEvent: String = "Hackathon Survival"

//    Дата проведения
val dateEvent: String = "01.01.2024"

//    Место проведения
val placeEvent: String = "Rome"

//    Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
private val budget: String by lazy { " 1000 eur for all" }

//    Количество участников
var numberParticipants: Int = 0

//    Длительность хакатона
val timeEvent: Int = 48

//    Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
val contactInfo: String by lazy { "many info" }

//    Текущее состояние хакатона (статус)
var stateEvent: String = "start"

//    Список спонсоров
var listSponsors: String = "1- sdfsdf 2 - sdsad"

//    Бюджет мероприятия
val budgetSum: Int = 1000

//    Текущий уровень доступа к интернету
var levelSignalInternet: Int = 5

//    Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
var infrostructurInfo: String = "sdgs"

//    Количество команд
var numberTeams: Int = 10

//    Перечень задач
val taskList: String = " sdfsf "

//    План эвакуации
val escapePlanRef: String = "./sdfsd/sdfsdf.pdf"

//    Список доступного оборудования
val equipmetList: String = "1. sdfsd  2 . sdfs ..."

//    Список свободного оборудования
var equipmentFree: String = "asd"

//    График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
lateinit var foodSchema: String

//    План мероприятий на случай сбоев
val planB: String by lazy { "1.dfsd 2.ddd ..." }

//    Список экспертов и жюри
val expertsList: String = "sdfsdf"

//    Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.
val checkList: String by lazy { " zfsdfsefsd adfsdfsd sdfsdf" }

//    Политика конфиденциальности
const val COPYRIGHTS: String = "dsfdfsdfsdfsd"

//    Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
var feedback: String = ""
    get() = field
//проверка доступов

//    Текущая температура в помещении
var currentTemperature: Double = 25.4

//    Мониторинг и анализ производительности сетевого оборудования и интернет-соединения.
var performanceCheck: String = ""

//    Уровень освещения
var levelLighting: Int = 5

//    Лог событий мероприятия
var logEvent: String = ""
    get() = field
    set(value) {
        field += value
    }

//    Доступность медицинской помощи
var medicinAvalible: Boolean = false;

//    Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
val securityPlanEvent: String = "jnj"

//    Регистрационный номер мероприятия
val regNumberEvent: String = ""

//    Максимально допустимый уровень шума в помещении хакатона.
val noisLevelMax: Int = 0

//    Индикатор превышения уровня шума в помещениях
var hasNoisOverLimit: Boolean = false;

//    Формат мероприятия (зависит от геополитической обстановки)
val formatEvent: String = ""

//    Количество свободных мест для отдыха (например, кресел или диванов), сеттер валидирует, чтобы количество не было меньше нуля.
var countFreePlace: Int = 0
    get() = field
    set(value) {
        if (field - value > 0) field = field - value
    }

//    План взаимодействия с прессой
var pressRelationsPlan: String = ""

//    Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.
lateinit var fullInfoProject: String

//    Статус получения всех необходимых разрешений
val aproveStatus: String by lazy { "" }

//    Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию)
var acceptEquip: Boolean = false

//    Список партнеров мероприятия
val partnerList: String by lazy { "" }

//    Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
lateinit var reportEvent: String

//    План распределения призов
val prizeDistributionPlan: String by lazy { "" }

//    Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам.
private val contactRescueService: String by lazy { "" }

//    Особые условия для участников с ограниченными возможностями
val specialConditions: String by lazy { "" }

//    Общее настроение участников (определяется опросами)
lateinit var fullMood: String

//    Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия.
val fullPlanEvent: String by lazy { "" }

//    Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия.
private val nameSpecialGuest: String = ""

//    Максимальное количество людей, которое может вместить место проведения.
val numberMemberMax: Int = 100

//    Стандартное количество часов, отведенное каждой команде для работы над проектом.
val timeProject: Int = 48

//    Текущая температура в помещении
var temperature: Int = 24

