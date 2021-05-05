package org.cdb84.s3viewer

import java.util.Date
import java.net.URL
import com.amazonaws.services.s3.model.S3Object

trait S3Handler {
	def getObjects(): List[S3Object] // change this to DirectoryTreeNode later
	def generatePresignedUrlForObject(obj: S3Object): URL
	def generatePresignedUrlForObject(obj: S3Object, expiry: Date): URL
}
