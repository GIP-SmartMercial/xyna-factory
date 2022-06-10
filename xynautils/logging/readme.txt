eigene Appender in log4j2 erstellen:

In log4j2 werden die Appender als Plugins deklariert. �ber die Plugin-Annotation wird der Name des Appenders
festgelegt, mit dem er in der Konfigurationsdatei (log4j2.xml) referenziert wird.

Die Appender m�ssen eine PluginFactory-Methode bereitstellen, die einen Appender erzeugt. Hier wird definiert
welche Attribute und Parameter �ber das log4j2.xml konfiguriert werden k�nnen.

Damit die Appender-Klasse gefunden wird muss im log4j2.xml bei der Configuration das entsprechende
package angegeben werden.



Folgende Klassen stehen in log4j2 nicht mehr zur Verf�gung (bzw. nur als no-op Version) und k�nnen durch die 
angegeben Klassen ersetzt werden:
- org.apache.log4j.spi.LoggingEvent -> org.apache.logging.log4j.core.LogEvent
- org.apache.log4j.AppenderSkeleton -> org.apache.logging.log4j.core.appender.AbstractAppender
  (activateOptions() wird dabei zu start() und close() zu stop())
