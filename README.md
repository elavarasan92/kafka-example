https://youtu.be/SqVfCyfCJqw?si=OENrqTCE5WrtZTeA

AmigosCode did using this youtube video 

https://kafka.apache.org/quickstart

Download the latest Kafka release and extract it:

$ tar -xzf kafka_2.13-4.0.0.tgz
$ cd kafka_2.13-4.0.0

Generate a Cluster UUID

$ KAFKA_CLUSTER_ID="$(bin/kafka-storage.sh random-uuid)"

Format Log Directories

$ bin/kafka-storage.sh format --standalone -t $KAFKA_CLUSTER_ID -c config/server.properties

Start the Kafka Server

$ bin/kafka-server-start.sh config/server.properties

$ bin/kafka-console-consumer.sh --topic ElavarasanTopic --from-beginning --bootstrap-server localhost:9092
This is my first event
This is my second event
