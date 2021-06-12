package com.github.pasteleiros.nortlulib

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.github.pasteleiros.nortlulib")
		.start()
}

