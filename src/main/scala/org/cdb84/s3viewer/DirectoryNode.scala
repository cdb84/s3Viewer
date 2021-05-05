package org.cdb84.s3viewer

import scala.collection.immutable.Stack

class DirectoryNode[A](value: A){

    def addChild(child: DirectoryNode[A]): Unit = {}
    def addPath(path: Stack[A]): Unit = {}
    def find(value: A): DirectoryNode[A] = { return new DirectoryNode[A](value) }
    def getChildren(): List[DirectoryNode[A]] = { return List(new DirectoryNode[A](value)) }
    def getParents(): List[DirectoryNode[A]] = { return List(new DirectoryNode[A](value)) }
    def toPath(): List[A] = { return List(value) }
}