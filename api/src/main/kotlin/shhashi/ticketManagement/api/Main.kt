package shhashi.ticketManagement.api

import io.ktor.server.application.Application
import io.ktor.server.engine.embeddedServer
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing
import io.ktor.server.tomcat.jakarta.Tomcat

fun main(args: Array<String>) {
  embeddedServer(
    Tomcat,
    port = 8080,
    module = Application::module,
  ).start(wait = true)
}

fun Application.module() {
  routing {
    get("/") {
      call.respondText("Hello World!")
    }
  }
}
