package com.galkinalex.kotlincourse.lesson19.homework.slotmachine

class SlotMachine(
    val color: String, // цвет
    val IdModel: String, // модель
    private var isOn: Boolean, // включен
    private var isOsLoad: Boolean, // ОС загружена
    private var gamesList: MutableList<String>, //список доступных игр
    private var joystickAvailable: Boolean, // наличие джойстика
    private var balance: Double, // баланс вырученных средств
    private val holder: String, // владелец
    val phoneSupport: String // телефон поддержки.
) {
    // включить
    protected fun switchOn(): Boolean {
        // do something important
        this.isOn = true
        return true
    }

    // выключить
    protected fun switchOff(): Boolean {
        // do something important
        this.isOn = false
        return true
    }

    //    загрузить ОС
    protected fun loadOs(): Boolean {
        // do something important
        this.isOsLoad = true
        return true
    }

    //    завершить работу ОС

    protected fun shutDownOS(): Boolean {
        // do something important
        this.isOsLoad = false
        return true
    }

    //    показать список игр
    fun getGamesList(): List<String> {
        return this.gamesList
    }

    //    включить игру
    protected fun startGame(game: String): Boolean {
        // do something important
        return true
    }

    //    оплатить игровой сеанс
    fun payGame(game: String): Boolean {
        // do something important
        return true
    }

    //    открыть сейф и выдать наличные
    protected fun collectionCash(): Boolean {
        // do something important
        this.balance = 0.0
        return true
    }

    //    выплатить выигрыш
    protected fun payOutWin(sumWin: Double): Boolean {
        // do something important
        this.balance -= sumWin
        return true
    }

}