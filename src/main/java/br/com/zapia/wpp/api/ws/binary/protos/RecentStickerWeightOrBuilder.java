// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WAMessage.proto

package br.com.zapia.wpp.api.ws.binary.protos;

public interface RecentStickerWeightOrBuilder extends
    // @@protoc_insertion_point(interface_extends:binary.RecentStickerWeight)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string filehash = 1;</code>
   * @return Whether the filehash field is set.
   */
  boolean hasFilehash();
  /**
   * <code>optional string filehash = 1;</code>
   * @return The filehash.
   */
  java.lang.String getFilehash();
  /**
   * <code>optional string filehash = 1;</code>
   * @return The bytes for filehash.
   */
  com.google.protobuf.ByteString
      getFilehashBytes();

  /**
   * <code>optional float weight = 2;</code>
   * @return Whether the weight field is set.
   */
  boolean hasWeight();
  /**
   * <code>optional float weight = 2;</code>
   * @return The weight.
   */
  float getWeight();
}
