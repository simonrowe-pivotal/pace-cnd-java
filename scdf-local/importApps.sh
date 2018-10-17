wget -qO- 'http://localhost:9393/apps' --post-data='uri=https://raw.githubusercontent.com/tzolov/computer-vision/master/CV-SNAPSHOT-stream-applications-rabbit-maven&force=true';
wget -qO- 'http://localhost:9393/apps' --post-data='uri=http://bit.ly/Darwin-SR1-stream-applications-rabbit-maven&force=true';
echo 'Stream apps imported'
wget -qO- 'http://localhost:9393/apps' --post-data='uri=http://bit.ly/Clark-GA-task-applications-maven&force=true';
echo 'Task apps imported'"

