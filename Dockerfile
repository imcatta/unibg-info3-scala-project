FROM hseeberger/scala-sbt:8u181_2.12.8_1.2.8
COPY . /root
CMD ["sbt ~run"]