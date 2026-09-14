// Tarea 1
/*
data class Event(
    val titulo: String,
    val descripcion: String? = null,
    val segmentoDia: String,
    val duracion: Int
)

fun main() {
    val event = Event(
        titulo = "Estudiar Kotlin",
        descripcion = "Comprometerse a estudiar Kotlin al menos 15 minutos al día.",
        segmentoDia = "Noche",
        duracion = 15
    )
    
    println("Evento(Titulo: ${event.titulo}, Descripcion: ${event.descripcion}, Segmento del dia: ${event.segmentoDia}, Duracion: ${event.duracion} minutos.)")
}
*/

// Tarea 2
/*
data class Event(
    val titulo: String,
    val descripcion: String? = null,
    val segmentoDia: SegmentoDia,
    val duracion: Int
)

enum class SegmentoDia {
    MANANA, TARDE, NOCHE
}

fun main() {
    val event = Event(
        titulo = "Estudiar Kotlin",
        descripcion = "Comprometerse a estudiar Kotlin al menos 15 minutos al día.",
        segmentoDia = SegmentoDia.NOCHE,
        duracion = 15
    )
    
    println("Evento(Titulo: ${event.titulo}, Descripcion: ${event.descripcion}, Segmento del dia: ${event.segmentoDia}, Duracion: ${event.duracion} minutos.)")
}
*/

// Tarea 3
/*
data class Event(
    val titulo: String,
    val descripcion: String? = null,
    val : SegmentoDia,
    val duracion: Int
)

enum class SegmentoDia {
    MANANA, TARDE, NOCHE
}

fun main() {
    val event1 = Event(titulo = "Wake up", descripcion = "Time to get up", segmentoDia = SegmentoDia.MANANA, duracion = 0)
    val event2 = Event(titulo = "Eat breakfast", segmentoDia = SegmentoDia.MANANA, duracion = 15)
    val event3 = Event(titulo = "Learn about Kotlin", segmentoDia = SegmentoDia.TARDE, duracion = 30)
    val event4 = Event(titulo = "Practice Compose", segmentoDia = SegmentoDia.TARDE, duracion = 60)
    val event5 = Event(titulo = "Watch latest DevBytes video", segmentoDia = SegmentoDia.TARDE, duracion = 10)
    val event6 = Event(titulo = "Check out latest Android Jetpack library", segmentoDia = SegmentoDia.NOCHE, duracion = 45)

    val eventos = mutableListOf(event1, event2, event3, event4, event5, event6)

    eventos.forEach { evento ->
        println("Evento(Titulo: ${evento.titulo}, Descripcion: ${evento.descripcion}, Segmento del dia: ${evento.segmentoDia}, Duracion: ${evento.duracion} min)")
    }
}
*/

// Tarea 4
/*
data class Event(
    val titulo: String,
    val descripcion: String? = null,
    val segmentoDia: SegmentoDia,
    val duracion: Int
)

enum class SegmentoDia {
    MANANA, TARDE, NOCHE
}

fun main() {
    val event1 = Event(titulo = "Wake up", descripcion = "Time to get up", segmentoDia = SegmentoDia.MANANA, duracion = 0)
    val event2 = Event(titulo = "Eat breakfast", segmentoDia = SegmentoDia.MANANA, duracion = 15)
    val event3 = Event(titulo = "Learn about Kotlin", segmentoDia = SegmentoDia.TARDE, duracion = 30)
    val event4 = Event(titulo = "Practice Compose", segmentoDia = SegmentoDia.TARDE, duracion = 60)
    val event5 = Event(titulo = "Watch latest DevBytes video", segmentoDia = SegmentoDia.TARDE, duracion = 10)
    val event6 = Event(titulo = "Check out latest Android Jetpack library", segmentoDia = SegmentoDia.NOCHE, duracion = 45)

    val eventos = mutableListOf(event1, event2, event3, event4, event5, event6)
	
    val eventosCorto = eventos.filter {
        it.duracion<60
    }
    
   println("Tienes ${eventosCorto.size} eventos cortos")
}
*/

// Tarea 5
/*
data class Event(
    val titulo: String,
    val descripcion: String? = null,
    val segmentoDia: SegmentoDia,
    val duracion: Int
)

enum class SegmentoDia {
    MANANA, TARDE, NOCHE
}

fun main() {
    val event1 = Event(titulo = "Wake up", descripcion = "Time to get up", segmentoDia = SegmentoDia.MANANA, duracion = 0)
    val event2 = Event(titulo = "Eat breakfast", segmentoDia = SegmentoDia.MANANA, duracion = 15)
    val event3 = Event(titulo = "Learn about Kotlin", segmentoDia = SegmentoDia.TARDE, duracion = 30)
    val event4 = Event(titulo = "Practice Compose", segmentoDia = SegmentoDia.TARDE, duracion = 60)
    val event5 = Event(titulo = "Watch latest DevBytes video", segmentoDia = SegmentoDia.TARDE, duracion = 10)
    val event6 = Event(titulo = "Check out latest Android Jetpack library", segmentoDia = SegmentoDia.NOCHE, duracion = 45)

    val eventos = mutableListOf(event1, event2, event3, event4, event5, event6)
	
   val resumenEventos = eventos.groupBy { it.segmentoDia }
   resumenEventos.forEach { (segmentoDia, eventos) ->
        println("$segmentoDia: ${eventos.size} events")
    }

}
*/

// Tarea 6
/*
data class Event(
    val titulo: String,
    val descripcion: String? = null,
    val segmentoDia: SegmentoDia,
    val duracion: Int
)

enum class SegmentoDia {
    MANANA, TARDE, NOCHE
}

fun main() {
    val event1 = Event(titulo = "Wake up", descripcion = "Time to get up", segmentoDia = SegmentoDia.MANANA, duracion = 0)
    val event2 = Event(titulo = "Eat breakfast", segmentoDia = SegmentoDia.MANANA, duracion = 15)
    val event3 = Event(titulo = "Learn about Kotlin", segmentoDia = SegmentoDia.TARDE, duracion = 30)
    val event4 = Event(titulo = "Practice Compose", segmentoDia = SegmentoDia.TARDE, duracion = 60)
    val event5 = Event(titulo = "Watch latest DevBytes video", segmentoDia = SegmentoDia.TARDE, duracion = 10)
    val event6 = Event(titulo = "Check out latest Android Jetpack library", segmentoDia = SegmentoDia.NOCHE, duracion = 45)

    val eventos = mutableListOf(event1, event2, event3, event4, event5, event6)
	
   println("Utlimo evento del dia: ${eventos.last().titulo}")

}
*/
// Tarea 7
/*
data class Event(
    val titulo: String,
    val descripcion: String? = null,
    val segmentoDia: SegmentoDia,
    val duracion: Int
    
)

enum class SegmentoDia {
    MANANA, TARDE, NOCHE
}

val Event.duracionEvento: String
    get() = if (this.duracion < 60) {
        "corto"
    } else {
        "largo"
    }
fun main() {
    val event1 = Event(titulo = "Wake up", descripcion = "Time to get up", segmentoDia = SegmentoDia.MANANA, duracion = 0)
    val event2 = Event(titulo = "Eat breakfast", segmentoDia = SegmentoDia.MANANA, duracion = 15)
    val event3 = Event(titulo = "Learn about Kotlin", segmentoDia = SegmentoDia.TARDE, duracion = 30)
    val event4 = Event(titulo = "Practice Compose", segmentoDia = SegmentoDia.TARDE, duracion = 60)
    val event5 = Event(titulo = "Watch latest DevBytes video", segmentoDia = SegmentoDia.TARDE, duracion = 10)
    val event6 = Event(titulo = "Check out latest Android Jetpack library", segmentoDia = SegmentoDia.NOCHE, duracion = 45)

    val eventos = mutableListOf(event1, event2, event3, event4, event5, event6)
    
	println("La duracion del primer evento: ${eventos[0].duracionEvento}")
}
*/