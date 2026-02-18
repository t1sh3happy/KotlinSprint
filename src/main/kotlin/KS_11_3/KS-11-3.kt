package org.Evgeniy.KS_11_3


data class User(

    val nickname: String,
    val avatarURL: String,
    var status: SpeakerStatus = SpeakerStatus.MIC_OFF,
)

enum class SpeakerStatus {
    TALKING,
    MIC_OFF,
    SILENCED
}

class Room(
    val nameFeed: String,
    val coverFeed: String,

    ) {
    val participantList: MutableMap<String, User> = mutableMapOf()
    fun addParticipant(user: User) {
        participantList[user.nickname] = user
    }

    fun changeStatus(nickname: String, status: SpeakerStatus) {
        participantList[nickname]?.status = status
    }
}

fun main() {
    val user1 = User("JohnBaton", "www.baton.net/somewhereurl/user/JohnBaton", SpeakerStatus.MIC_OFF)
    val user2 = User("KekChelovek", "www.baton.net/somewhereurl/user/KekChelovek", SpeakerStatus.MIC_OFF)
    val user3 = User("Student", "www.baton.net/somewhereurl/user/Student", SpeakerStatus.MIC_OFF)
    val user4 = User("UralVagonMash", "www.baton.net/somewhereurl/user/UralVagonMash", SpeakerStatus.MIC_OFF)

    val room1 = Room("Hello_There", "www.baton.net/somewhereurl/group/Hello_There")
    room1.addParticipant(user1)
    room1.addParticipant(user2)
    println(room1.participantList.values)
    room1.addParticipant(user3)
    room1.addParticipant(user4)
    println(room1.participantList.values)
    room1.changeStatus("JohnBaton", SpeakerStatus.TALKING)
    println(user1.status)
    room1.changeStatus("JohnBaton", SpeakerStatus.MIC_OFF)
    println(user1.status)
    room1.changeStatus("JohnBaton", SpeakerStatus.SILENCED)
    println(user1.status)

}
