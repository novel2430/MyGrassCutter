// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DJAALJGPLCI.proto

package emu.grasscutter.net.proto;

public final class DJAALJGPLCIOuterClass {
  private DJAALJGPLCIOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DJAALJGPLCIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DJAALJGPLCI)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
     */
    java.util.List<emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM> 
        getNCHJAAHOKMOList();
    /**
     * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
     */
    emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM getNCHJAAHOKMO(int index);
    /**
     * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
     */
    int getNCHJAAHOKMOCount();
    /**
     * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDMOrBuilder> 
        getNCHJAAHOKMOOrBuilderList();
    /**
     * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
     */
    emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDMOrBuilder getNCHJAAHOKMOOrBuilder(
        int index);

    /**
     * <code>int32 EHADMEEKMAD = 9;</code>
     * @return The eHADMEEKMAD.
     */
    int getEHADMEEKMAD();
  }
  /**
   * <pre>
   * CmdId: 3772
   * </pre>
   *
   * Protobuf type {@code DJAALJGPLCI}
   */
  public static final class DJAALJGPLCI extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DJAALJGPLCI)
      DJAALJGPLCIOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DJAALJGPLCI.newBuilder() to construct.
    private DJAALJGPLCI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DJAALJGPLCI() {
      nCHJAAHOKMO_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DJAALJGPLCI();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DJAALJGPLCI(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 42: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                nCHJAAHOKMO_ = new java.util.ArrayList<emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM>();
                mutable_bitField0_ |= 0x00000001;
              }
              nCHJAAHOKMO_.add(
                  input.readMessage(emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM.parser(), extensionRegistry));
              break;
            }
            case 72: {

              eHADMEEKMAD_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          nCHJAAHOKMO_ = java.util.Collections.unmodifiableList(nCHJAAHOKMO_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.internal_static_DJAALJGPLCI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.internal_static_DJAALJGPLCI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI.class, emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI.Builder.class);
    }

    public static final int NCHJAAHOKMO_FIELD_NUMBER = 5;
    private java.util.List<emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM> nCHJAAHOKMO_;
    /**
     * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM> getNCHJAAHOKMOList() {
      return nCHJAAHOKMO_;
    }
    /**
     * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDMOrBuilder> 
        getNCHJAAHOKMOOrBuilderList() {
      return nCHJAAHOKMO_;
    }
    /**
     * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
     */
    @java.lang.Override
    public int getNCHJAAHOKMOCount() {
      return nCHJAAHOKMO_.size();
    }
    /**
     * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM getNCHJAAHOKMO(int index) {
      return nCHJAAHOKMO_.get(index);
    }
    /**
     * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDMOrBuilder getNCHJAAHOKMOOrBuilder(
        int index) {
      return nCHJAAHOKMO_.get(index);
    }

    public static final int EHADMEEKMAD_FIELD_NUMBER = 9;
    private int eHADMEEKMAD_;
    /**
     * <code>int32 EHADMEEKMAD = 9;</code>
     * @return The eHADMEEKMAD.
     */
    @java.lang.Override
    public int getEHADMEEKMAD() {
      return eHADMEEKMAD_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < nCHJAAHOKMO_.size(); i++) {
        output.writeMessage(5, nCHJAAHOKMO_.get(i));
      }
      if (eHADMEEKMAD_ != 0) {
        output.writeInt32(9, eHADMEEKMAD_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < nCHJAAHOKMO_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, nCHJAAHOKMO_.get(i));
      }
      if (eHADMEEKMAD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, eHADMEEKMAD_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI other = (emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI) obj;

      if (!getNCHJAAHOKMOList()
          .equals(other.getNCHJAAHOKMOList())) return false;
      if (getEHADMEEKMAD()
          != other.getEHADMEEKMAD()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getNCHJAAHOKMOCount() > 0) {
        hash = (37 * hash) + NCHJAAHOKMO_FIELD_NUMBER;
        hash = (53 * hash) + getNCHJAAHOKMOList().hashCode();
      }
      hash = (37 * hash) + EHADMEEKMAD_FIELD_NUMBER;
      hash = (53 * hash) + getEHADMEEKMAD();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 3772
     * </pre>
     *
     * Protobuf type {@code DJAALJGPLCI}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DJAALJGPLCI)
        emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.internal_static_DJAALJGPLCI_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.internal_static_DJAALJGPLCI_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI.class, emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getNCHJAAHOKMOFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (nCHJAAHOKMOBuilder_ == null) {
          nCHJAAHOKMO_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          nCHJAAHOKMOBuilder_.clear();
        }
        eHADMEEKMAD_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.internal_static_DJAALJGPLCI_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI build() {
        emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI buildPartial() {
        emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI result = new emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI(this);
        int from_bitField0_ = bitField0_;
        if (nCHJAAHOKMOBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            nCHJAAHOKMO_ = java.util.Collections.unmodifiableList(nCHJAAHOKMO_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.nCHJAAHOKMO_ = nCHJAAHOKMO_;
        } else {
          result.nCHJAAHOKMO_ = nCHJAAHOKMOBuilder_.build();
        }
        result.eHADMEEKMAD_ = eHADMEEKMAD_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI) {
          return mergeFrom((emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI other) {
        if (other == emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI.getDefaultInstance()) return this;
        if (nCHJAAHOKMOBuilder_ == null) {
          if (!other.nCHJAAHOKMO_.isEmpty()) {
            if (nCHJAAHOKMO_.isEmpty()) {
              nCHJAAHOKMO_ = other.nCHJAAHOKMO_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureNCHJAAHOKMOIsMutable();
              nCHJAAHOKMO_.addAll(other.nCHJAAHOKMO_);
            }
            onChanged();
          }
        } else {
          if (!other.nCHJAAHOKMO_.isEmpty()) {
            if (nCHJAAHOKMOBuilder_.isEmpty()) {
              nCHJAAHOKMOBuilder_.dispose();
              nCHJAAHOKMOBuilder_ = null;
              nCHJAAHOKMO_ = other.nCHJAAHOKMO_;
              bitField0_ = (bitField0_ & ~0x00000001);
              nCHJAAHOKMOBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getNCHJAAHOKMOFieldBuilder() : null;
            } else {
              nCHJAAHOKMOBuilder_.addAllMessages(other.nCHJAAHOKMO_);
            }
          }
        }
        if (other.getEHADMEEKMAD() != 0) {
          setEHADMEEKMAD(other.getEHADMEEKMAD());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM> nCHJAAHOKMO_ =
        java.util.Collections.emptyList();
      private void ensureNCHJAAHOKMOIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          nCHJAAHOKMO_ = new java.util.ArrayList<emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM>(nCHJAAHOKMO_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM, emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM.Builder, emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDMOrBuilder> nCHJAAHOKMOBuilder_;

      /**
       * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM> getNCHJAAHOKMOList() {
        if (nCHJAAHOKMOBuilder_ == null) {
          return java.util.Collections.unmodifiableList(nCHJAAHOKMO_);
        } else {
          return nCHJAAHOKMOBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
       */
      public int getNCHJAAHOKMOCount() {
        if (nCHJAAHOKMOBuilder_ == null) {
          return nCHJAAHOKMO_.size();
        } else {
          return nCHJAAHOKMOBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
       */
      public emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM getNCHJAAHOKMO(int index) {
        if (nCHJAAHOKMOBuilder_ == null) {
          return nCHJAAHOKMO_.get(index);
        } else {
          return nCHJAAHOKMOBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
       */
      public Builder setNCHJAAHOKMO(
          int index, emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM value) {
        if (nCHJAAHOKMOBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNCHJAAHOKMOIsMutable();
          nCHJAAHOKMO_.set(index, value);
          onChanged();
        } else {
          nCHJAAHOKMOBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
       */
      public Builder setNCHJAAHOKMO(
          int index, emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM.Builder builderForValue) {
        if (nCHJAAHOKMOBuilder_ == null) {
          ensureNCHJAAHOKMOIsMutable();
          nCHJAAHOKMO_.set(index, builderForValue.build());
          onChanged();
        } else {
          nCHJAAHOKMOBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
       */
      public Builder addNCHJAAHOKMO(emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM value) {
        if (nCHJAAHOKMOBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNCHJAAHOKMOIsMutable();
          nCHJAAHOKMO_.add(value);
          onChanged();
        } else {
          nCHJAAHOKMOBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
       */
      public Builder addNCHJAAHOKMO(
          int index, emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM value) {
        if (nCHJAAHOKMOBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNCHJAAHOKMOIsMutable();
          nCHJAAHOKMO_.add(index, value);
          onChanged();
        } else {
          nCHJAAHOKMOBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
       */
      public Builder addNCHJAAHOKMO(
          emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM.Builder builderForValue) {
        if (nCHJAAHOKMOBuilder_ == null) {
          ensureNCHJAAHOKMOIsMutable();
          nCHJAAHOKMO_.add(builderForValue.build());
          onChanged();
        } else {
          nCHJAAHOKMOBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
       */
      public Builder addNCHJAAHOKMO(
          int index, emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM.Builder builderForValue) {
        if (nCHJAAHOKMOBuilder_ == null) {
          ensureNCHJAAHOKMOIsMutable();
          nCHJAAHOKMO_.add(index, builderForValue.build());
          onChanged();
        } else {
          nCHJAAHOKMOBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
       */
      public Builder addAllNCHJAAHOKMO(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM> values) {
        if (nCHJAAHOKMOBuilder_ == null) {
          ensureNCHJAAHOKMOIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, nCHJAAHOKMO_);
          onChanged();
        } else {
          nCHJAAHOKMOBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
       */
      public Builder clearNCHJAAHOKMO() {
        if (nCHJAAHOKMOBuilder_ == null) {
          nCHJAAHOKMO_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          nCHJAAHOKMOBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
       */
      public Builder removeNCHJAAHOKMO(int index) {
        if (nCHJAAHOKMOBuilder_ == null) {
          ensureNCHJAAHOKMOIsMutable();
          nCHJAAHOKMO_.remove(index);
          onChanged();
        } else {
          nCHJAAHOKMOBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
       */
      public emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM.Builder getNCHJAAHOKMOBuilder(
          int index) {
        return getNCHJAAHOKMOFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
       */
      public emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDMOrBuilder getNCHJAAHOKMOOrBuilder(
          int index) {
        if (nCHJAAHOKMOBuilder_ == null) {
          return nCHJAAHOKMO_.get(index);  } else {
          return nCHJAAHOKMOBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDMOrBuilder> 
           getNCHJAAHOKMOOrBuilderList() {
        if (nCHJAAHOKMOBuilder_ != null) {
          return nCHJAAHOKMOBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(nCHJAAHOKMO_);
        }
      }
      /**
       * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
       */
      public emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM.Builder addNCHJAAHOKMOBuilder() {
        return getNCHJAAHOKMOFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM.getDefaultInstance());
      }
      /**
       * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
       */
      public emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM.Builder addNCHJAAHOKMOBuilder(
          int index) {
        return getNCHJAAHOKMOFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM.getDefaultInstance());
      }
      /**
       * <code>repeated .CNIMFPGIPDM NCHJAAHOKMO = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM.Builder> 
           getNCHJAAHOKMOBuilderList() {
        return getNCHJAAHOKMOFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM, emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM.Builder, emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDMOrBuilder> 
          getNCHJAAHOKMOFieldBuilder() {
        if (nCHJAAHOKMOBuilder_ == null) {
          nCHJAAHOKMOBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM, emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDM.Builder, emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.CNIMFPGIPDMOrBuilder>(
                  nCHJAAHOKMO_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          nCHJAAHOKMO_ = null;
        }
        return nCHJAAHOKMOBuilder_;
      }

      private int eHADMEEKMAD_ ;
      /**
       * <code>int32 EHADMEEKMAD = 9;</code>
       * @return The eHADMEEKMAD.
       */
      @java.lang.Override
      public int getEHADMEEKMAD() {
        return eHADMEEKMAD_;
      }
      /**
       * <code>int32 EHADMEEKMAD = 9;</code>
       * @param value The eHADMEEKMAD to set.
       * @return This builder for chaining.
       */
      public Builder setEHADMEEKMAD(int value) {
        
        eHADMEEKMAD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 EHADMEEKMAD = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearEHADMEEKMAD() {
        
        eHADMEEKMAD_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:DJAALJGPLCI)
    }

    // @@protoc_insertion_point(class_scope:DJAALJGPLCI)
    private static final emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI();
    }

    public static emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DJAALJGPLCI>
        PARSER = new com.google.protobuf.AbstractParser<DJAALJGPLCI>() {
      @java.lang.Override
      public DJAALJGPLCI parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DJAALJGPLCI(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DJAALJGPLCI> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DJAALJGPLCI> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DJAALJGPLCIOuterClass.DJAALJGPLCI getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DJAALJGPLCI_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DJAALJGPLCI_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021DJAALJGPLCI.proto\032\021CNIMFPGIPDM.proto\"E" +
      "\n\013DJAALJGPLCI\022!\n\013NCHJAAHOKMO\030\005 \003(\0132\014.CNI" +
      "MFPGIPDM\022\023\n\013EHADMEEKMAD\030\t \001(\005B\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.getDescriptor(),
        });
    internal_static_DJAALJGPLCI_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DJAALJGPLCI_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DJAALJGPLCI_descriptor,
        new java.lang.String[] { "NCHJAAHOKMO", "EHADMEEKMAD", });
    emu.grasscutter.net.proto.CNIMFPGIPDMOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
