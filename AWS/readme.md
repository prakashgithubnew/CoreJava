**How to perform memory optimization for AWS Lambdas**
------------------------------------------------------
1. Use AWS Lambda power tuning tool to identify how much memory can be used for a good performance.
    This tool uses the AWS Step function which makes a concurrent call to lambda on different memory
    allocations and monitor the performance. After monitoring a graph will be generated whcih displays the 
    cost , performance and memory graph which you can decide what to configure in lambda.
2. Remove access logging as it can lead to performance degrade.
3. Use appropriate instances for your usage.
4. Examine thread pools and blocking operations.
5. use AWS X Ray for tracing info like request and response time and latency it is incurring.
6. 