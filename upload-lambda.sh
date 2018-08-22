#!/bin/bash
aws lambda update-function-code \
 --function-name='awsLambdaShowcase'\
 --region='eu-central-1' \
 --zip-file=fileb://build/libs/awslambdashowcase-1.0-SNAPSHOT-all.jar