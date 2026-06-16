package org.Evgeniy.KS_22_4

class MainScreenViewModel {
    data class MainScreenState(
        val data: String,
        val isLoading: Boolean = false,
    )

    var mainScreenState = MainScreenState(data = "", isLoading = false)

    fun loadData() {
        mainScreenState = mainScreenState.copy(data = "")
        println(mainScreenState)
        mainScreenState = mainScreenState.copy(isLoading = true)
        println(mainScreenState)
        mainScreenState = mainScreenState.copy(data = "Что-то", isLoading = false)
        println(mainScreenState)

    }
}

fun main() {
    val mainScreenViewModel = MainScreenViewModel()
    mainScreenViewModel.loadData()
}
