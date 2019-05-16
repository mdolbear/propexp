#!/usr/bin/env bash

kubectl create -f propexp-configmap.yml
kubectl create -f propexp-deployment.yml
kubectl create -f propexp-service.yml

