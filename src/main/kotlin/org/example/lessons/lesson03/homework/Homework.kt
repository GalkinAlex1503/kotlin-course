package org.example.org.example.lessons.lesson03.homework

//Должна ли переменная изменяться со временем? (val или var)
//Может ли она быть установлена при инициализации? (lateinit var для отложенной инициализации)
//Каким значением должно быть при инициализировано?
//Требуется ли немедленная инициализация значения, либо же больше подходит инициализация в момент обращения? (через by lazy)
//Как назвать переменную, чтобы другой человек прочитав этот код мог понять, что она хранит?


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
val budgetSum: Double = 1000.0

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

//    График питания участников
lateinit var foodSchema: String

//    План мероприятий на случай сбоев
val planB: String by lazy { "1.dfsd 2.ddd ..." }

//    Список экспертов и жюри
val expertsList: String = "sdfsdf"

//    Политика конфиденциальности
const val COPYRIGHTS: String = "dsfdfsdfsdfsd"

//    Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
var feedback: String = ""
    get() = field

//    Текущая температура в помещении
var currentTemperature: Double = 25.4

//    Данные мониторинга и анализ производительности сетевого оборудования и интернет-соединения для целей отладки своих приложений командами
var performanceCheck: String = ""

//   Регулятор скорости интернета (понижающий коэффициент, например 0.5)
var speedLevel: Double = 0.5

//    Уровень освещения
var levelLighting: Int = 5

//    Лог событий мероприятия
var logEvent: String = ""
    get() = field
    set(value) {
        field += value
    }

//    Возможность получения медицинской помощи прямо на мероприятии (да/нет)
var medicinAvalible: Boolean = false;

//    Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
val securityPlanEvent: String = "jnj"

//    Регистрационный номер мероприятия
val regNumberEvent: String = ""

//    Максимально допустимый уровень шума в помещении хакатона.
val noisLevelMax: Int = 0

//    Индикатор превышения уровня шума в помещениях (превышен или не превышен в данный момент)
var hasNoisOverLimit: Boolean = false;

//    План взаимодействия с прессой
var pressRelationsPlan: String = ""

//    Детальная публичная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.
lateinit var fullInfoProject: String

//    Статус получения всех необходимых разрешений для проведения мероприятия
val aproveStatus: String by lazy { "" }

//    Индикатор доступности специализированного оборудования в данный момент (например, специальному оборудованию)
var acceptEquip: Boolean = false

//    Список партнеров мероприятия
val partnerList: String by lazy { "" }

//    Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
lateinit var reportEvent: String

//    Внутренние правила распределения призов
val prizeDistributionPlan: String by lazy { "" }

//    Список разыгрываемых призов
val prizeList: String = "Prize 1, Prize 2, Prize 3"

//    Контактная информация экстренных служб, медицинского персонала и других важных служб, для внутреннего пользования.
private val contactRescueService: String by lazy { "" }

//    Особые условия для участников с ограниченными возможностями
val specialConditions: String by lazy { "" }

//    Общее настроение участников (определяется опросами)
lateinit var fullMood: String

//    Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия, так как зависит от фактического состава команд и взятых в работу задач.
val fullPlanEvent: String by lazy { "" }

//    Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия, но в момент инициализации неизвестно.
private val nameSpecialGuest: String = ""

//    Максимальное количество людей, которое может вместить место проведения.
val numberMemberMax: Int = 100

//    Количество часов, отведенное каждой команде для работы над проектом.
val timeProject: Int = 48
