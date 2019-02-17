package unibg.info3.logging

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

// Scala has no enum, 
// so we use sealed trail
sealed trait Level
case object Debug extends Level
case object Info extends Level
case object Warning extends Level
case object Error extends Level

// Singleton
object Logger {
  
  private def getCurrentTime = LocalDateTime.now.format(DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss"))
  
  def log(level: Level, message: Any) = println(s"$getCurrentTime - $level - $message")
  
  def debug(message: Any): Unit = log(Debug, message)
  def info(message: Any): Unit = log(Info, message)
  def warn(message: Any): Unit = log(Warning, message)
  def error(message: Any): Unit = log(Error, message)
  
}