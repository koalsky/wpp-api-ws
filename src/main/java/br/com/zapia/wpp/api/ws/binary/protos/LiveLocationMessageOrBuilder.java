// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

public interface LiveLocationMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.LiveLocationMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional double degreesLatitude = 1;</code>
   * @return Whether the degreesLatitude field is set.
   */
  boolean hasDegreesLatitude();
  /**
   * <code>optional double degreesLatitude = 1;</code>
   * @return The degreesLatitude.
   */
  double getDegreesLatitude();

  /**
   * <code>optional double degreesLongitude = 2;</code>
   * @return Whether the degreesLongitude field is set.
   */
  boolean hasDegreesLongitude();
  /**
   * <code>optional double degreesLongitude = 2;</code>
   * @return The degreesLongitude.
   */
  double getDegreesLongitude();

  /**
   * <code>optional uint32 accuracyInMeters = 3;</code>
   * @return Whether the accuracyInMeters field is set.
   */
  boolean hasAccuracyInMeters();
  /**
   * <code>optional uint32 accuracyInMeters = 3;</code>
   * @return The accuracyInMeters.
   */
  int getAccuracyInMeters();

  /**
   * <code>optional float speedInMps = 4;</code>
   * @return Whether the speedInMps field is set.
   */
  boolean hasSpeedInMps();
  /**
   * <code>optional float speedInMps = 4;</code>
   * @return The speedInMps.
   */
  float getSpeedInMps();

  /**
   * <code>optional uint32 degreesClockwiseFromMagneticNorth = 5;</code>
   * @return Whether the degreesClockwiseFromMagneticNorth field is set.
   */
  boolean hasDegreesClockwiseFromMagneticNorth();
  /**
   * <code>optional uint32 degreesClockwiseFromMagneticNorth = 5;</code>
   * @return The degreesClockwiseFromMagneticNorth.
   */
  int getDegreesClockwiseFromMagneticNorth();

  /**
   * <code>optional string caption = 6;</code>
   * @return Whether the caption field is set.
   */
  boolean hasCaption();
  /**
   * <code>optional string caption = 6;</code>
   * @return The caption.
   */
  java.lang.String getCaption();
  /**
   * <code>optional string caption = 6;</code>
   * @return The bytes for caption.
   */
  com.google.protobuf.ByteString
      getCaptionBytes();

  /**
   * <code>optional int64 sequenceNumber = 7;</code>
   * @return Whether the sequenceNumber field is set.
   */
  boolean hasSequenceNumber();
  /**
   * <code>optional int64 sequenceNumber = 7;</code>
   * @return The sequenceNumber.
   */
  long getSequenceNumber();

  /**
   * <code>optional uint32 timeOffset = 8;</code>
   * @return Whether the timeOffset field is set.
   */
  boolean hasTimeOffset();
  /**
   * <code>optional uint32 timeOffset = 8;</code>
   * @return The timeOffset.
   */
  int getTimeOffset();

  /**
   * <code>optional bytes jpegThumbnail = 16;</code>
   * @return Whether the jpegThumbnail field is set.
   */
  boolean hasJpegThumbnail();
  /**
   * <code>optional bytes jpegThumbnail = 16;</code>
   * @return The jpegThumbnail.
   */
  com.google.protobuf.ByteString getJpegThumbnail();

  /**
   * <code>optional .binary.ContextInfo contextInfo = 17;</code>
   * @return Whether the contextInfo field is set.
   */
  boolean hasContextInfo();
  /**
   * <code>optional .binary.ContextInfo contextInfo = 17;</code>
   * @return The contextInfo.
   */
  br.com.zapia.wpp.api.ws.binary.protos.ContextInfo getContextInfo();
  /**
   * <code>optional .binary.ContextInfo contextInfo = 17;</code>
   */
  br.com.zapia.wpp.api.ws.binary.protos.ContextInfoOrBuilder getContextInfoOrBuilder();
}
