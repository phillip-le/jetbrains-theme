package com.github.philliple.theme.services

import com.intellij.openapi.project.Project
import com.github.philliple.theme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
