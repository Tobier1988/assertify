package com.github.tobier1988.assertify.services

import com.github.tobier1988.assertify.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
