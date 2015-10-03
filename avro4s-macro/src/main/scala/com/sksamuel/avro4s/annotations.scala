package com.sksamuel.avro4s

import scala.annotation.StaticAnnotation

case class AvroFixed(size: Int) extends StaticAnnotation

case class AvroAlias(aliases: String*) extends StaticAnnotation