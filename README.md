# propexp
This project experiments with passing arguments from kubernetes into a spring boot application. I take the approach of basically
overriding the application.yml file in a Kubernetes ConfigMap. This seems to work pretty well. One still provides the
application.yml file in code for when you need to run outside of the container (tests, etc), but override the application.yml
file when running inside of a k8s cluster.
