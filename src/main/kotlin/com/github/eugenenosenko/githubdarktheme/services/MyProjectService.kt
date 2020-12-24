package com.github.eugenenosenko.githubdarktheme.services

import com.intellij.openapi.project.Project
import com.github.eugenenosenko.githubdarktheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
