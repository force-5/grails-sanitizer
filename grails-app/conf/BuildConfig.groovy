grails.project.work.dir = 'target'

grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		grailsCentral()
		mavenLocal()
		mavenCentral()
		mavenRepo "https://repository.sonatype.org/content/repositories/central"
		mavenRepo "https://repo.grails.org/grails/core"
		mavenRepo "https://repo.grails.org/grails/plugins"
		mavenRepo "https://repo1.maven.org/maven2"
	}

	dependencies {
		compile('org.owasp.antisamy:antisamy:1.5.3')
		runtime('net.sourceforge.nekohtml:nekohtml:1.9.16') {
			excludes "xml-apis"
		}
		build ('org.kuali.maven.wagons:maven-s3-wagon:1.1.22') {
			export = false
			exclude 'slf4j-log4j12'
		}
	}

	plugins {
		build ':release:3.0.1', ':rest-client-builder:2.0.3', {
			export = false
		}
	}
}
