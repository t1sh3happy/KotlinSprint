package org.Evgeniy.KS_14_5

class Chat() {

    private val messages: MutableList<Message> = mutableListOf()

    fun addMessage(text: String, autor: String) {
        val message = Message(text, autor, id = messages.size + 1)
        messages.add(message)
    }

    fun addThreadMessage(text: String, autor: String, parentMessageId: Int) {
        val message = ChildMessage(text, autor, id = messages.size + 1, parentMessageId)
        messages.add(message)
    }

    fun printChat() {
        val grouped = messages.groupBy { m ->
            if (m is ChildMessage) m.parentMessageId
            else m.id
        }
        grouped.forEach { (key, group) ->
            val parent = group.first()
            println("${parent.autor}: ${parent.text}")

            group.drop(1).forEach { child ->
                println("\t${child.autor}: ${child.text}")
            }
        }
    }
}

open class Message(
    val text: String,
    val autor: String,
    val id: Int,
)

class ChildMessage(
    text: String,
    autor: String,
    id: Int,
    val parentMessageId: Int
) : Message(text, autor, id) {}

fun main() {
    val chat = Chat()
    chat.addMessage("Привет!", "Иван")
    chat.addMessage("Как дела?", "Петр")
    chat.addThreadMessage("Отлично!", "Мария", parentMessageId = 2)
    chat.printChat()
}