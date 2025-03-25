**Features of Dynamo DB**
--------------------------

* NO SQL DB
* no queries needed
* Fully managed and server less and highly scalable
* Uses key value pair for storing key value pair
* Single-digit millisecond latency.
* Multi-region replication for high availability.

**Backup in Dynamo DB**
-----------------------

Backups can be done in Dynamo DB using one of the preferred method

    Point-in-Time Recovery (PITR) - Automatically Recovery

* Automatic continuous backups with the ability to restore to any point within the last 35 days.
* Useful for accidental deletions, data corruption, or ransomware attacks.
* Needs to be enabled explicitly.
* To enable it go to AWS Dynamo DB console -->Click Backups-->Enable Point in recovery backup option.


    Export to S3 for Custom Backups - Manual

* You can export DynamoDB data to Amazon S3 for custom processing, analytics, or long-term storage.
* Data is exported in Parquet or JSON format.
* No impact on table performance.


