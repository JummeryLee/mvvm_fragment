package com.github.jummerylee.mvvmfragment.services

import com.intellij.openapi.project.Project
import com.github.jummerylee.mvvmfragment.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
