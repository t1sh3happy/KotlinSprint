package org.Evgeniy.KS_11_5

class Forum {
    private val userList = mutableListOf<ForumMember>()
    private val messageList = mutableListOf<ForumMessage>()
    fun createNewUser(userName: String): ForumMember {
        val user = ForumMember.Builder(userName).build(userList.size)
        userList.add(user)
        return user
    }

    fun createNewMessage(authorId: Int, message: String): ForumMessage? {
        if (userList.any { it.userId == authorId }) {
            val newMessage = ForumMessage.Builder(authorId).build(message)
            messageList.add(newMessage)
            return newMessage
        } else {
            return null
        }
    }

    fun printThread() {
        messageList.forEach { message ->
            val authorMessage = userList.find { it.userId == message.authorId }
            println("${authorMessage?.userName}: ${message.message}")
        }
    }
}

class ForumMember private constructor(
    val userId: Int,
    val userName: String,
) {
    class Builder(val userName: String) {

        fun build(userId: Int): ForumMember {
            return ForumMember(userId, userName)
        }
    }
}

class ForumMessage private constructor(
    val authorId: Int,
    val message: String,
) {
    class Builder(val authorId: Int) {

        fun build(message: String): ForumMessage {
            return ForumMessage(authorId, message)
        }
    }
}

fun main() {
    val forum = Forum()
    val user1 = forum.createNewUser("XleB")
    val user2 = forum.createNewUser("Baton")

    forum.createNewMessage(0, "Привед")
    forum.createNewMessage(1, "Медвед")
    forum.createNewMessage(0, "Ты из какого")
    forum.createNewMessage(1, "2007-го")

    forum.printThread()
}
