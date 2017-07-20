package Protobuf;

public final class Models {
    private Models() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public enum Status
            implements com.google.protobuf.Internal.EnumLite {
        Failed(0, 0),
        Succeed(1, 1),;

        public static final int Failed_VALUE = 0;
        public static final int Succeed_VALUE = 1;


        public final int getNumber() {
            return value;
        }

        public static Status valueOf(int value) {
            switch (value) {
                case 0:
                    return Failed;
                case 1:
                    return Succeed;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
            return internalValueMap;
        }

        private static com.google.protobuf.Internal.EnumLiteMap<Status>
                internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<Status>() {
                    public Status findValueByNumber(int number) {
                        return Status.valueOf(number);
                    }
                };

        private final int value;

        private Status(int index, int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:Status)
    }

    public interface RequestBaseOrBuilder
            extends com.google.protobuf.MessageLiteOrBuilder {

        // optional string Command = 1;
        boolean hasCommand();

        String getCommand();

        // optional bytes Data = 2;
        boolean hasData();

        com.google.protobuf.ByteString getData();
    }

    public static final class RequestBase extends
            com.google.protobuf.GeneratedMessageLite
            implements RequestBaseOrBuilder {
        // Use RequestBase.newBuilder() to construct.
        private RequestBase(Builder builder) {
            super(builder);
        }

        private RequestBase(boolean noInit) {
        }

        private static final RequestBase defaultInstance;

        public static RequestBase getDefaultInstance() {
            return defaultInstance;
        }

        public RequestBase getDefaultInstanceForType() {
            return defaultInstance;
        }

        private int bitField0_;
        // optional string Command = 1;
        public static final int COMMAND_FIELD_NUMBER = 1;
        private java.lang.Object command_;

        public boolean hasCommand() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        public String getCommand() {
            java.lang.Object ref = command_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    command_ = s;
                }
                return s;
            }
        }

        private com.google.protobuf.ByteString getCommandBytes() {
            java.lang.Object ref = command_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                command_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional bytes Data = 2;
        public static final int DATA_FIELD_NUMBER = 2;
        private com.google.protobuf.ByteString data_;

        public boolean hasData() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        public com.google.protobuf.ByteString getData() {
            return data_;
        }

        private void initFields() {
            command_ = "";
            data_ = com.google.protobuf.ByteString.EMPTY;
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, getCommandBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, data_);
            }
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(1, getCommandBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, data_);
            }
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Protobuf.Models.RequestBase parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.RequestBase parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.RequestBase parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.RequestBase parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.RequestBase parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.RequestBase parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.RequestBase parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.RequestBase parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.RequestBase parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.RequestBase parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Protobuf.Models.RequestBase prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends
                com.google.protobuf.GeneratedMessageLite.Builder<
                        Protobuf.Models.RequestBase, Builder>
                implements Protobuf.Models.RequestBaseOrBuilder {
            // Construct using Protobuf.Models.RequestBase.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                command_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                data_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Protobuf.Models.RequestBase getDefaultInstanceForType() {
                return Protobuf.Models.RequestBase.getDefaultInstance();
            }

            public Protobuf.Models.RequestBase build() {
                Protobuf.Models.RequestBase result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            private Protobuf.Models.RequestBase buildParsed()
                    throws com.google.protobuf.InvalidProtocolBufferException {
                Protobuf.Models.RequestBase result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(
                            result).asInvalidProtocolBufferException();
                }
                return result;
            }

            public Protobuf.Models.RequestBase buildPartial() {
                Protobuf.Models.RequestBase result = new Protobuf.Models.RequestBase(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.command_ = command_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.data_ = data_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(Protobuf.Models.RequestBase other) {
                if (other == Protobuf.Models.RequestBase.getDefaultInstance()) return this;
                if (other.hasCommand()) {
                    setCommand(other.getCommand());
                }
                if (other.hasData()) {
                    setData(other.getData());
                }
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                while (true) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:

                            return this;
                        default: {
                            if (!parseUnknownField(input, extensionRegistry, tag)) {

                                return this;
                            }
                            break;
                        }
                        case 10: {
                            bitField0_ |= 0x00000001;
                            command_ = input.readBytes();
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            data_ = input.readBytes();
                            break;
                        }
                    }
                }
            }

            private int bitField0_;

            // optional string Command = 1;
            private java.lang.Object command_ = "";

            public boolean hasCommand() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            public String getCommand() {
                java.lang.Object ref = command_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    command_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            public Builder setCommand(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                command_ = value;

                return this;
            }

            public Builder clearCommand() {
                bitField0_ = (bitField0_ & ~0x00000001);
                command_ = getDefaultInstance().getCommand();

                return this;
            }

            void setCommand(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000001;
                command_ = value;

            }

            // optional bytes Data = 2;
            private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;

            public boolean hasData() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }

            public com.google.protobuf.ByteString getData() {
                return data_;
            }

            public Builder setData(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                data_ = value;

                return this;
            }

            public Builder clearData() {
                bitField0_ = (bitField0_ & ~0x00000002);
                data_ = getDefaultInstance().getData();

                return this;
            }

            // @@protoc_insertion_point(builder_scope:RequestBase)
        }

        static {
            defaultInstance = new RequestBase(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:RequestBase)
    }

    public interface RespondBaseOrBuilder
            extends com.google.protobuf.MessageLiteOrBuilder {

        // optional .Status Status = 1 [default = Succeed];
        boolean hasStatus();

        Protobuf.Models.Status getStatus();

        // optional string Message = 2;
        boolean hasMessage();

        String getMessage();

        // optional bytes Data = 3;
        boolean hasData();

        com.google.protobuf.ByteString getData();
    }

    public static final class RespondBase extends
            com.google.protobuf.GeneratedMessageLite
            implements RespondBaseOrBuilder {
        // Use RespondBase.newBuilder() to construct.
        private RespondBase(Builder builder) {
            super(builder);
        }

        private RespondBase(boolean noInit) {
        }

        private static final RespondBase defaultInstance;

        public static RespondBase getDefaultInstance() {
            return defaultInstance;
        }

        public RespondBase getDefaultInstanceForType() {
            return defaultInstance;
        }

        private int bitField0_;
        // optional .Status Status = 1 [default = Succeed];
        public static final int STATUS_FIELD_NUMBER = 1;
        private Protobuf.Models.Status status_;

        public boolean hasStatus() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        public Protobuf.Models.Status getStatus() {
            return status_;
        }

        // optional string Message = 2;
        public static final int MESSAGE_FIELD_NUMBER = 2;
        private java.lang.Object message_;

        public boolean hasMessage() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        public String getMessage() {
            java.lang.Object ref = message_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    message_ = s;
                }
                return s;
            }
        }

        private com.google.protobuf.ByteString getMessageBytes() {
            java.lang.Object ref = message_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                message_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional bytes Data = 3;
        public static final int DATA_FIELD_NUMBER = 3;
        private com.google.protobuf.ByteString data_;

        public boolean hasData() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }

        public com.google.protobuf.ByteString getData() {
            return data_;
        }

        private void initFields() {
            status_ = Protobuf.Models.Status.Succeed;
            message_ = "";
            data_ = com.google.protobuf.ByteString.EMPTY;
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeEnum(1, status_.getNumber());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, getMessageBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBytes(3, data_);
            }
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(1, status_.getNumber());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, getMessageBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(3, data_);
            }
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Protobuf.Models.RespondBase parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.RespondBase parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.RespondBase parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.RespondBase parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.RespondBase parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.RespondBase parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.RespondBase parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.RespondBase parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.RespondBase parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.RespondBase parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Protobuf.Models.RespondBase prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends
                com.google.protobuf.GeneratedMessageLite.Builder<
                        Protobuf.Models.RespondBase, Builder>
                implements Protobuf.Models.RespondBaseOrBuilder {
            // Construct using Protobuf.Models.RespondBase.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                status_ = Protobuf.Models.Status.Succeed;
                bitField0_ = (bitField0_ & ~0x00000001);
                message_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                data_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Protobuf.Models.RespondBase getDefaultInstanceForType() {
                return Protobuf.Models.RespondBase.getDefaultInstance();
            }

            public Protobuf.Models.RespondBase build() {
                Protobuf.Models.RespondBase result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            private Protobuf.Models.RespondBase buildParsed()
                    throws com.google.protobuf.InvalidProtocolBufferException {
                Protobuf.Models.RespondBase result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(
                            result).asInvalidProtocolBufferException();
                }
                return result;
            }

            public Protobuf.Models.RespondBase buildPartial() {
                Protobuf.Models.RespondBase result = new Protobuf.Models.RespondBase(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.status_ = status_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.message_ = message_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.data_ = data_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(Protobuf.Models.RespondBase other) {
                if (other == Protobuf.Models.RespondBase.getDefaultInstance()) return this;
                if (other.hasStatus()) {
                    setStatus(other.getStatus());
                }
                if (other.hasMessage()) {
                    setMessage(other.getMessage());
                }
                if (other.hasData()) {
                    setData(other.getData());
                }
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                while (true) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:

                            return this;
                        default: {
                            if (!parseUnknownField(input, extensionRegistry, tag)) {

                                return this;
                            }
                            break;
                        }
                        case 8: {
                            int rawValue = input.readEnum();
                            Protobuf.Models.Status value = Protobuf.Models.Status.valueOf(rawValue);
                            if (value != null) {
                                bitField0_ |= 0x00000001;
                                status_ = value;
                            }
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            message_ = input.readBytes();
                            break;
                        }
                        case 26: {
                            bitField0_ |= 0x00000004;
                            data_ = input.readBytes();
                            break;
                        }
                    }
                }
            }

            private int bitField0_;

            // optional .Status Status = 1 [default = Succeed];
            private Protobuf.Models.Status status_ = Protobuf.Models.Status.Succeed;

            public boolean hasStatus() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            public Protobuf.Models.Status getStatus() {
                return status_;
            }

            public Builder setStatus(Protobuf.Models.Status value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                status_ = value;

                return this;
            }

            public Builder clearStatus() {
                bitField0_ = (bitField0_ & ~0x00000001);
                status_ = Protobuf.Models.Status.Succeed;

                return this;
            }

            // optional string Message = 2;
            private java.lang.Object message_ = "";

            public boolean hasMessage() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }

            public String getMessage() {
                java.lang.Object ref = message_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    message_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            public Builder setMessage(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                message_ = value;

                return this;
            }

            public Builder clearMessage() {
                bitField0_ = (bitField0_ & ~0x00000002);
                message_ = getDefaultInstance().getMessage();

                return this;
            }

            void setMessage(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000002;
                message_ = value;

            }

            // optional bytes Data = 3;
            private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;

            public boolean hasData() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }

            public com.google.protobuf.ByteString getData() {
                return data_;
            }

            public Builder setData(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                data_ = value;

                return this;
            }

            public Builder clearData() {
                bitField0_ = (bitField0_ & ~0x00000004);
                data_ = getDefaultInstance().getData();

                return this;
            }

            // @@protoc_insertion_point(builder_scope:RespondBase)
        }

        static {
            defaultInstance = new RespondBase(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:RespondBase)
    }

    public interface Int32SingleOrBuilder
            extends com.google.protobuf.MessageLiteOrBuilder {

        // optional int32 Data = 1;
        boolean hasData();

        int getData();
    }

    public static final class Int32Single extends
            com.google.protobuf.GeneratedMessageLite
            implements Int32SingleOrBuilder {
        // Use Int32Single.newBuilder() to construct.
        private Int32Single(Builder builder) {
            super(builder);
        }

        private Int32Single(boolean noInit) {
        }

        private static final Int32Single defaultInstance;

        public static Int32Single getDefaultInstance() {
            return defaultInstance;
        }

        public Int32Single getDefaultInstanceForType() {
            return defaultInstance;
        }

        private int bitField0_;
        // optional int32 Data = 1;
        public static final int DATA_FIELD_NUMBER = 1;
        private int data_;

        public boolean hasData() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        public int getData() {
            return data_;
        }

        private void initFields() {
            data_ = 0;
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeInt32(1, data_);
            }
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, data_);
            }
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Protobuf.Models.Int32Single parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.Int32Single parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.Int32Single parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.Int32Single parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.Int32Single parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.Int32Single parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.Int32Single parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.Int32Single parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.Int32Single parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.Int32Single parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Protobuf.Models.Int32Single prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends
                com.google.protobuf.GeneratedMessageLite.Builder<
                        Protobuf.Models.Int32Single, Builder>
                implements Protobuf.Models.Int32SingleOrBuilder {
            // Construct using Protobuf.Models.Int32Single.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                data_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Protobuf.Models.Int32Single getDefaultInstanceForType() {
                return Protobuf.Models.Int32Single.getDefaultInstance();
            }

            public Protobuf.Models.Int32Single build() {
                Protobuf.Models.Int32Single result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            private Protobuf.Models.Int32Single buildParsed()
                    throws com.google.protobuf.InvalidProtocolBufferException {
                Protobuf.Models.Int32Single result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(
                            result).asInvalidProtocolBufferException();
                }
                return result;
            }

            public Protobuf.Models.Int32Single buildPartial() {
                Protobuf.Models.Int32Single result = new Protobuf.Models.Int32Single(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.data_ = data_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(Protobuf.Models.Int32Single other) {
                if (other == Protobuf.Models.Int32Single.getDefaultInstance()) return this;
                if (other.hasData()) {
                    setData(other.getData());
                }
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                while (true) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:

                            return this;
                        default: {
                            if (!parseUnknownField(input, extensionRegistry, tag)) {

                                return this;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            data_ = input.readInt32();
                            break;
                        }
                    }
                }
            }

            private int bitField0_;

            // optional int32 Data = 1;
            private int data_;

            public boolean hasData() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            public int getData() {
                return data_;
            }

            public Builder setData(int value) {
                bitField0_ |= 0x00000001;
                data_ = value;

                return this;
            }

            public Builder clearData() {
                bitField0_ = (bitField0_ & ~0x00000001);
                data_ = 0;

                return this;
            }

            // @@protoc_insertion_point(builder_scope:Int32Single)
        }

        static {
            defaultInstance = new Int32Single(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:Int32Single)
    }

    public interface StringSingleOrBuilder
            extends com.google.protobuf.MessageLiteOrBuilder {

        // optional string Data = 1;
        boolean hasData();

        String getData();
    }

    public static final class StringSingle extends
            com.google.protobuf.GeneratedMessageLite
            implements StringSingleOrBuilder {
        // Use StringSingle.newBuilder() to construct.
        private StringSingle(Builder builder) {
            super(builder);
        }

        private StringSingle(boolean noInit) {
        }

        private static final StringSingle defaultInstance;

        public static StringSingle getDefaultInstance() {
            return defaultInstance;
        }

        public StringSingle getDefaultInstanceForType() {
            return defaultInstance;
        }

        private int bitField0_;
        // optional string Data = 1;
        public static final int DATA_FIELD_NUMBER = 1;
        private java.lang.Object data_;

        public boolean hasData() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        public String getData() {
            java.lang.Object ref = data_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    data_ = s;
                }
                return s;
            }
        }

        private com.google.protobuf.ByteString getDataBytes() {
            java.lang.Object ref = data_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                data_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private void initFields() {
            data_ = "";
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, getDataBytes());
            }
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(1, getDataBytes());
            }
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Protobuf.Models.StringSingle parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.StringSingle parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.StringSingle parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.StringSingle parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.StringSingle parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.StringSingle parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.StringSingle parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.StringSingle parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.StringSingle parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.StringSingle parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Protobuf.Models.StringSingle prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends
                com.google.protobuf.GeneratedMessageLite.Builder<
                        Protobuf.Models.StringSingle, Builder>
                implements Protobuf.Models.StringSingleOrBuilder {
            // Construct using Protobuf.Models.StringSingle.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                data_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Protobuf.Models.StringSingle getDefaultInstanceForType() {
                return Protobuf.Models.StringSingle.getDefaultInstance();
            }

            public Protobuf.Models.StringSingle build() {
                Protobuf.Models.StringSingle result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            private Protobuf.Models.StringSingle buildParsed()
                    throws com.google.protobuf.InvalidProtocolBufferException {
                Protobuf.Models.StringSingle result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(
                            result).asInvalidProtocolBufferException();
                }
                return result;
            }

            public Protobuf.Models.StringSingle buildPartial() {
                Protobuf.Models.StringSingle result = new Protobuf.Models.StringSingle(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.data_ = data_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(Protobuf.Models.StringSingle other) {
                if (other == Protobuf.Models.StringSingle.getDefaultInstance()) return this;
                if (other.hasData()) {
                    setData(other.getData());
                }
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                while (true) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:

                            return this;
                        default: {
                            if (!parseUnknownField(input, extensionRegistry, tag)) {

                                return this;
                            }
                            break;
                        }
                        case 10: {
                            bitField0_ |= 0x00000001;
                            data_ = input.readBytes();
                            break;
                        }
                    }
                }
            }

            private int bitField0_;

            // optional string Data = 1;
            private java.lang.Object data_ = "";

            public boolean hasData() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            public String getData() {
                java.lang.Object ref = data_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    data_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            public Builder setData(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                data_ = value;

                return this;
            }

            public Builder clearData() {
                bitField0_ = (bitField0_ & ~0x00000001);
                data_ = getDefaultInstance().getData();

                return this;
            }

            void setData(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000001;
                data_ = value;

            }

            // @@protoc_insertion_point(builder_scope:StringSingle)
        }

        static {
            defaultInstance = new StringSingle(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:StringSingle)
    }

    public interface NewsInfoOrBuilder
            extends com.google.protobuf.MessageLiteOrBuilder {

        // optional uint32 NewsId = 1;
        boolean hasNewsId();

        int getNewsId();

        // optional string Title = 2;
        boolean hasTitle();

        String getTitle();

        // optional string SubTitle_Cn = 3;
        boolean hasSubTitleCn();

        String getSubTitleCn();

        // optional string SubTitle_En = 4;
        boolean hasSubTitleEn();

        String getSubTitleEn();

        // optional string ImageUrl = 5;
        boolean hasImageUrl();

        String getImageUrl();

        // optional string Content = 6;
        boolean hasContent();

        String getContent();

        // optional uint32 Target = 7;
        boolean hasTarget();

        int getTarget();

        // optional string CategoryName = 8;
        boolean hasCategoryName();

        String getCategoryName();
    }

    public static final class NewsInfo extends
            com.google.protobuf.GeneratedMessageLite
            implements NewsInfoOrBuilder {
        // Use NewsInfo.newBuilder() to construct.
        private NewsInfo(Builder builder) {
            super(builder);
        }

        private NewsInfo(boolean noInit) {
        }

        private static final NewsInfo defaultInstance;

        public static NewsInfo getDefaultInstance() {
            return defaultInstance;
        }

        public NewsInfo getDefaultInstanceForType() {
            return defaultInstance;
        }

        private int bitField0_;
        // optional uint32 NewsId = 1;
        public static final int NEWSID_FIELD_NUMBER = 1;
        private int newsId_;

        public boolean hasNewsId() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        public int getNewsId() {
            return newsId_;
        }

        // optional string Title = 2;
        public static final int TITLE_FIELD_NUMBER = 2;
        private java.lang.Object title_;

        public boolean hasTitle() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        public String getTitle() {
            java.lang.Object ref = title_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    title_ = s;
                }
                return s;
            }
        }

        private com.google.protobuf.ByteString getTitleBytes() {
            java.lang.Object ref = title_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                title_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional string SubTitle_Cn = 3;
        public static final int SUBTITLE_CN_FIELD_NUMBER = 3;
        private java.lang.Object subTitleCn_;

        public boolean hasSubTitleCn() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }

        public String getSubTitleCn() {
            java.lang.Object ref = subTitleCn_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    subTitleCn_ = s;
                }
                return s;
            }
        }

        private com.google.protobuf.ByteString getSubTitleCnBytes() {
            java.lang.Object ref = subTitleCn_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                subTitleCn_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional string SubTitle_En = 4;
        public static final int SUBTITLE_EN_FIELD_NUMBER = 4;
        private java.lang.Object subTitleEn_;

        public boolean hasSubTitleEn() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }

        public String getSubTitleEn() {
            java.lang.Object ref = subTitleEn_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    subTitleEn_ = s;
                }
                return s;
            }
        }

        private com.google.protobuf.ByteString getSubTitleEnBytes() {
            java.lang.Object ref = subTitleEn_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                subTitleEn_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional string ImageUrl = 5;
        public static final int IMAGEURL_FIELD_NUMBER = 5;
        private java.lang.Object imageUrl_;

        public boolean hasImageUrl() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }

        public String getImageUrl() {
            java.lang.Object ref = imageUrl_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    imageUrl_ = s;
                }
                return s;
            }
        }

        private com.google.protobuf.ByteString getImageUrlBytes() {
            java.lang.Object ref = imageUrl_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                imageUrl_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional string Content = 6;
        public static final int CONTENT_FIELD_NUMBER = 6;
        private java.lang.Object content_;

        public boolean hasContent() {
            return ((bitField0_ & 0x00000020) == 0x00000020);
        }

        public String getContent() {
            java.lang.Object ref = content_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    content_ = s;
                }
                return s;
            }
        }

        private com.google.protobuf.ByteString getContentBytes() {
            java.lang.Object ref = content_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                content_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional uint32 Target = 7;
        public static final int TARGET_FIELD_NUMBER = 7;
        private int target_;

        public boolean hasTarget() {
            return ((bitField0_ & 0x00000040) == 0x00000040);
        }

        public int getTarget() {
            return target_;
        }

        // optional string CategoryName = 8;
        public static final int CATEGORYNAME_FIELD_NUMBER = 8;
        private java.lang.Object categoryName_;

        public boolean hasCategoryName() {
            return ((bitField0_ & 0x00000080) == 0x00000080);
        }

        public String getCategoryName() {
            java.lang.Object ref = categoryName_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    categoryName_ = s;
                }
                return s;
            }
        }

        private com.google.protobuf.ByteString getCategoryNameBytes() {
            java.lang.Object ref = categoryName_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                categoryName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private void initFields() {
            newsId_ = 0;
            title_ = "";
            subTitleCn_ = "";
            subTitleEn_ = "";
            imageUrl_ = "";
            content_ = "";
            target_ = 0;
            categoryName_ = "";
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeUInt32(1, newsId_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, getTitleBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBytes(3, getSubTitleCnBytes());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeBytes(4, getSubTitleEnBytes());
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                output.writeBytes(5, getImageUrlBytes());
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                output.writeBytes(6, getContentBytes());
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                output.writeUInt32(7, target_);
            }
            if (((bitField0_ & 0x00000080) == 0x00000080)) {
                output.writeBytes(8, getCategoryNameBytes());
            }
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(1, newsId_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, getTitleBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(3, getSubTitleCnBytes());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(4, getSubTitleEnBytes());
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(5, getImageUrlBytes());
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(6, getContentBytes());
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(7, target_);
            }
            if (((bitField0_ & 0x00000080) == 0x00000080)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(8, getCategoryNameBytes());
            }
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Protobuf.Models.NewsInfo parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.NewsInfo parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.NewsInfo parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.NewsInfo parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.NewsInfo parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.NewsInfo parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.NewsInfo parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.NewsInfo parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.NewsInfo parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.NewsInfo parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Protobuf.Models.NewsInfo prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends
                com.google.protobuf.GeneratedMessageLite.Builder<
                        Protobuf.Models.NewsInfo, Builder>
                implements Protobuf.Models.NewsInfoOrBuilder {
            // Construct using Protobuf.Models.NewsInfo.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                newsId_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                title_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                subTitleCn_ = "";
                bitField0_ = (bitField0_ & ~0x00000004);
                subTitleEn_ = "";
                bitField0_ = (bitField0_ & ~0x00000008);
                imageUrl_ = "";
                bitField0_ = (bitField0_ & ~0x00000010);
                content_ = "";
                bitField0_ = (bitField0_ & ~0x00000020);
                target_ = 0;
                bitField0_ = (bitField0_ & ~0x00000040);
                categoryName_ = "";
                bitField0_ = (bitField0_ & ~0x00000080);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Protobuf.Models.NewsInfo getDefaultInstanceForType() {
                return Protobuf.Models.NewsInfo.getDefaultInstance();
            }

            public Protobuf.Models.NewsInfo build() {
                Protobuf.Models.NewsInfo result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            private Protobuf.Models.NewsInfo buildParsed()
                    throws com.google.protobuf.InvalidProtocolBufferException {
                Protobuf.Models.NewsInfo result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(
                            result).asInvalidProtocolBufferException();
                }
                return result;
            }

            public Protobuf.Models.NewsInfo buildPartial() {
                Protobuf.Models.NewsInfo result = new Protobuf.Models.NewsInfo(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.newsId_ = newsId_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.title_ = title_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.subTitleCn_ = subTitleCn_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.subTitleEn_ = subTitleEn_;
                if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                    to_bitField0_ |= 0x00000010;
                }
                result.imageUrl_ = imageUrl_;
                if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
                    to_bitField0_ |= 0x00000020;
                }
                result.content_ = content_;
                if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
                    to_bitField0_ |= 0x00000040;
                }
                result.target_ = target_;
                if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
                    to_bitField0_ |= 0x00000080;
                }
                result.categoryName_ = categoryName_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(Protobuf.Models.NewsInfo other) {
                if (other == Protobuf.Models.NewsInfo.getDefaultInstance()) return this;
                if (other.hasNewsId()) {
                    setNewsId(other.getNewsId());
                }
                if (other.hasTitle()) {
                    setTitle(other.getTitle());
                }
                if (other.hasSubTitleCn()) {
                    setSubTitleCn(other.getSubTitleCn());
                }
                if (other.hasSubTitleEn()) {
                    setSubTitleEn(other.getSubTitleEn());
                }
                if (other.hasImageUrl()) {
                    setImageUrl(other.getImageUrl());
                }
                if (other.hasContent()) {
                    setContent(other.getContent());
                }
                if (other.hasTarget()) {
                    setTarget(other.getTarget());
                }
                if (other.hasCategoryName()) {
                    setCategoryName(other.getCategoryName());
                }
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                while (true) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:

                            return this;
                        default: {
                            if (!parseUnknownField(input, extensionRegistry, tag)) {

                                return this;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            newsId_ = input.readUInt32();
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            title_ = input.readBytes();
                            break;
                        }
                        case 26: {
                            bitField0_ |= 0x00000004;
                            subTitleCn_ = input.readBytes();
                            break;
                        }
                        case 34: {
                            bitField0_ |= 0x00000008;
                            subTitleEn_ = input.readBytes();
                            break;
                        }
                        case 42: {
                            bitField0_ |= 0x00000010;
                            imageUrl_ = input.readBytes();
                            break;
                        }
                        case 50: {
                            bitField0_ |= 0x00000020;
                            content_ = input.readBytes();
                            break;
                        }
                        case 56: {
                            bitField0_ |= 0x00000040;
                            target_ = input.readUInt32();
                            break;
                        }
                        case 66: {
                            bitField0_ |= 0x00000080;
                            categoryName_ = input.readBytes();
                            break;
                        }
                    }
                }
            }

            private int bitField0_;

            // optional uint32 NewsId = 1;
            private int newsId_;

            public boolean hasNewsId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            public int getNewsId() {
                return newsId_;
            }

            public Builder setNewsId(int value) {
                bitField0_ |= 0x00000001;
                newsId_ = value;

                return this;
            }

            public Builder clearNewsId() {
                bitField0_ = (bitField0_ & ~0x00000001);
                newsId_ = 0;

                return this;
            }

            // optional string Title = 2;
            private java.lang.Object title_ = "";

            public boolean hasTitle() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }

            public String getTitle() {
                java.lang.Object ref = title_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    title_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            public Builder setTitle(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                title_ = value;

                return this;
            }

            public Builder clearTitle() {
                bitField0_ = (bitField0_ & ~0x00000002);
                title_ = getDefaultInstance().getTitle();

                return this;
            }

            void setTitle(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000002;
                title_ = value;

            }

            // optional string SubTitle_Cn = 3;
            private java.lang.Object subTitleCn_ = "";

            public boolean hasSubTitleCn() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }

            public String getSubTitleCn() {
                java.lang.Object ref = subTitleCn_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    subTitleCn_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            public Builder setSubTitleCn(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                subTitleCn_ = value;

                return this;
            }

            public Builder clearSubTitleCn() {
                bitField0_ = (bitField0_ & ~0x00000004);
                subTitleCn_ = getDefaultInstance().getSubTitleCn();

                return this;
            }

            void setSubTitleCn(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000004;
                subTitleCn_ = value;

            }

            // optional string SubTitle_En = 4;
            private java.lang.Object subTitleEn_ = "";

            public boolean hasSubTitleEn() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }

            public String getSubTitleEn() {
                java.lang.Object ref = subTitleEn_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    subTitleEn_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            public Builder setSubTitleEn(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                subTitleEn_ = value;

                return this;
            }

            public Builder clearSubTitleEn() {
                bitField0_ = (bitField0_ & ~0x00000008);
                subTitleEn_ = getDefaultInstance().getSubTitleEn();

                return this;
            }

            void setSubTitleEn(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000008;
                subTitleEn_ = value;

            }

            // optional string ImageUrl = 5;
            private java.lang.Object imageUrl_ = "";

            public boolean hasImageUrl() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }

            public String getImageUrl() {
                java.lang.Object ref = imageUrl_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    imageUrl_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            public Builder setImageUrl(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000010;
                imageUrl_ = value;

                return this;
            }

            public Builder clearImageUrl() {
                bitField0_ = (bitField0_ & ~0x00000010);
                imageUrl_ = getDefaultInstance().getImageUrl();

                return this;
            }

            void setImageUrl(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000010;
                imageUrl_ = value;

            }

            // optional string Content = 6;
            private java.lang.Object content_ = "";

            public boolean hasContent() {
                return ((bitField0_ & 0x00000020) == 0x00000020);
            }

            public String getContent() {
                java.lang.Object ref = content_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    content_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            public Builder setContent(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000020;
                content_ = value;

                return this;
            }

            public Builder clearContent() {
                bitField0_ = (bitField0_ & ~0x00000020);
                content_ = getDefaultInstance().getContent();

                return this;
            }

            void setContent(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000020;
                content_ = value;

            }

            // optional uint32 Target = 7;
            private int target_;

            public boolean hasTarget() {
                return ((bitField0_ & 0x00000040) == 0x00000040);
            }

            public int getTarget() {
                return target_;
            }

            public Builder setTarget(int value) {
                bitField0_ |= 0x00000040;
                target_ = value;

                return this;
            }

            public Builder clearTarget() {
                bitField0_ = (bitField0_ & ~0x00000040);
                target_ = 0;

                return this;
            }

            // optional string CategoryName = 8;
            private java.lang.Object categoryName_ = "";

            public boolean hasCategoryName() {
                return ((bitField0_ & 0x00000080) == 0x00000080);
            }

            public String getCategoryName() {
                java.lang.Object ref = categoryName_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    categoryName_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            public Builder setCategoryName(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000080;
                categoryName_ = value;

                return this;
            }

            public Builder clearCategoryName() {
                bitField0_ = (bitField0_ & ~0x00000080);
                categoryName_ = getDefaultInstance().getCategoryName();

                return this;
            }

            void setCategoryName(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000080;
                categoryName_ = value;

            }

            // @@protoc_insertion_point(builder_scope:NewsInfo)
        }

        static {
            defaultInstance = new NewsInfo(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:NewsInfo)
    }

    public interface SentenceListOrBuilder
            extends com.google.protobuf.MessageLiteOrBuilder {

        // repeated .NewsInfo DataList = 1;
        java.util.List<Protobuf.Models.NewsInfo>
        getDataListList();

        Protobuf.Models.NewsInfo getDataList(int index);

        int getDataListCount();
    }

    public static final class SentenceList extends
            com.google.protobuf.GeneratedMessageLite
            implements SentenceListOrBuilder {
        // Use SentenceList.newBuilder() to construct.
        private SentenceList(Builder builder) {
            super(builder);
        }

        private SentenceList(boolean noInit) {
        }

        private static final SentenceList defaultInstance;

        public static SentenceList getDefaultInstance() {
            return defaultInstance;
        }

        public SentenceList getDefaultInstanceForType() {
            return defaultInstance;
        }

        // repeated .NewsInfo DataList = 1;
        public static final int DATALIST_FIELD_NUMBER = 1;
        private java.util.List<Protobuf.Models.NewsInfo> dataList_;

        public java.util.List<Protobuf.Models.NewsInfo> getDataListList() {
            return dataList_;
        }

        public java.util.List<? extends Protobuf.Models.NewsInfoOrBuilder>
        getDataListOrBuilderList() {
            return dataList_;
        }

        public int getDataListCount() {
            return dataList_.size();
        }

        public Protobuf.Models.NewsInfo getDataList(int index) {
            return dataList_.get(index);
        }

        public Protobuf.Models.NewsInfoOrBuilder getDataListOrBuilder(
                int index) {
            return dataList_.get(index);
        }

        private void initFields() {
            dataList_ = java.util.Collections.emptyList();
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            for (int i = 0; i < dataList_.size(); i++) {
                output.writeMessage(1, dataList_.get(i));
            }
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            for (int i = 0; i < dataList_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, dataList_.get(i));
            }
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Protobuf.Models.SentenceList parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.SentenceList parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.SentenceList parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.SentenceList parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.SentenceList parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.SentenceList parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.SentenceList parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.SentenceList parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.SentenceList parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.SentenceList parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Protobuf.Models.SentenceList prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends
                com.google.protobuf.GeneratedMessageLite.Builder<
                        Protobuf.Models.SentenceList, Builder>
                implements Protobuf.Models.SentenceListOrBuilder {
            // Construct using Protobuf.Models.SentenceList.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                dataList_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Protobuf.Models.SentenceList getDefaultInstanceForType() {
                return Protobuf.Models.SentenceList.getDefaultInstance();
            }

            public Protobuf.Models.SentenceList build() {
                Protobuf.Models.SentenceList result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            private Protobuf.Models.SentenceList buildParsed()
                    throws com.google.protobuf.InvalidProtocolBufferException {
                Protobuf.Models.SentenceList result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(
                            result).asInvalidProtocolBufferException();
                }
                return result;
            }

            public Protobuf.Models.SentenceList buildPartial() {
                Protobuf.Models.SentenceList result = new Protobuf.Models.SentenceList(this);
                int from_bitField0_ = bitField0_;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    dataList_ = java.util.Collections.unmodifiableList(dataList_);
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.dataList_ = dataList_;
                return result;
            }

            public Builder mergeFrom(Protobuf.Models.SentenceList other) {
                if (other == Protobuf.Models.SentenceList.getDefaultInstance()) return this;
                if (!other.dataList_.isEmpty()) {
                    if (dataList_.isEmpty()) {
                        dataList_ = other.dataList_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        ensureDataListIsMutable();
                        dataList_.addAll(other.dataList_);
                    }

                }
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                while (true) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:

                            return this;
                        default: {
                            if (!parseUnknownField(input, extensionRegistry, tag)) {

                                return this;
                            }
                            break;
                        }
                        case 10: {
                            Protobuf.Models.NewsInfo.Builder subBuilder = Protobuf.Models.NewsInfo.newBuilder();
                            input.readMessage(subBuilder, extensionRegistry);
                            addDataList(subBuilder.buildPartial());
                            break;
                        }
                    }
                }
            }

            private int bitField0_;

            // repeated .NewsInfo DataList = 1;
            private java.util.List<Protobuf.Models.NewsInfo> dataList_ =
                    java.util.Collections.emptyList();

            private void ensureDataListIsMutable() {
                if (!((bitField0_ & 0x00000001) == 0x00000001)) {
                    dataList_ = new java.util.ArrayList<Protobuf.Models.NewsInfo>(dataList_);
                    bitField0_ |= 0x00000001;
                }
            }

            public java.util.List<Protobuf.Models.NewsInfo> getDataListList() {
                return java.util.Collections.unmodifiableList(dataList_);
            }

            public int getDataListCount() {
                return dataList_.size();
            }

            public Protobuf.Models.NewsInfo getDataList(int index) {
                return dataList_.get(index);
            }

            public Builder setDataList(
                    int index, Protobuf.Models.NewsInfo value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureDataListIsMutable();
                dataList_.set(index, value);

                return this;
            }

            public Builder setDataList(
                    int index, Protobuf.Models.NewsInfo.Builder builderForValue) {
                ensureDataListIsMutable();
                dataList_.set(index, builderForValue.build());

                return this;
            }

            public Builder addDataList(Protobuf.Models.NewsInfo value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureDataListIsMutable();
                dataList_.add(value);

                return this;
            }

            public Builder addDataList(
                    int index, Protobuf.Models.NewsInfo value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureDataListIsMutable();
                dataList_.add(index, value);

                return this;
            }

            public Builder addDataList(
                    Protobuf.Models.NewsInfo.Builder builderForValue) {
                ensureDataListIsMutable();
                dataList_.add(builderForValue.build());

                return this;
            }

            public Builder addDataList(
                    int index, Protobuf.Models.NewsInfo.Builder builderForValue) {
                ensureDataListIsMutable();
                dataList_.add(index, builderForValue.build());

                return this;
            }

            public Builder addAllDataList(
                    java.lang.Iterable<? extends Protobuf.Models.NewsInfo> values) {
                ensureDataListIsMutable();
                super.addAll(values, dataList_);

                return this;
            }

            public Builder clearDataList() {
                dataList_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000001);

                return this;
            }

            public Builder removeDataList(int index) {
                ensureDataListIsMutable();
                dataList_.remove(index);

                return this;
            }

            // @@protoc_insertion_point(builder_scope:SentenceList)
        }

        static {
            defaultInstance = new SentenceList(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:SentenceList)
    }

    public interface NewsQueryOrBuilder
            extends com.google.protobuf.MessageLiteOrBuilder {

        // optional int32 QuerySize = 1;
        boolean hasQuerySize();

        int getQuerySize();

        // optional int32 QueryIndex = 2;
        boolean hasQueryIndex();

        int getQueryIndex();
    }

    public static final class NewsQuery extends
            com.google.protobuf.GeneratedMessageLite
            implements NewsQueryOrBuilder {
        // Use NewsQuery.newBuilder() to construct.
        private NewsQuery(Builder builder) {
            super(builder);
        }

        private NewsQuery(boolean noInit) {
        }

        private static final NewsQuery defaultInstance;

        public static NewsQuery getDefaultInstance() {
            return defaultInstance;
        }

        public NewsQuery getDefaultInstanceForType() {
            return defaultInstance;
        }

        private int bitField0_;
        // optional int32 QuerySize = 1;
        public static final int QUERYSIZE_FIELD_NUMBER = 1;
        private int querySize_;

        public boolean hasQuerySize() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        public int getQuerySize() {
            return querySize_;
        }

        // optional int32 QueryIndex = 2;
        public static final int QUERYINDEX_FIELD_NUMBER = 2;
        private int queryIndex_;

        public boolean hasQueryIndex() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        public int getQueryIndex() {
            return queryIndex_;
        }

        private void initFields() {
            querySize_ = 0;
            queryIndex_ = 0;
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeInt32(1, querySize_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeInt32(2, queryIndex_);
            }
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, querySize_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(2, queryIndex_);
            }
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Protobuf.Models.NewsQuery parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.NewsQuery parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.NewsQuery parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.NewsQuery parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.NewsQuery parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.NewsQuery parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.NewsQuery parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.NewsQuery parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.NewsQuery parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.NewsQuery parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Protobuf.Models.NewsQuery prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends
                com.google.protobuf.GeneratedMessageLite.Builder<
                        Protobuf.Models.NewsQuery, Builder>
                implements Protobuf.Models.NewsQueryOrBuilder {
            // Construct using Protobuf.Models.NewsQuery.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                querySize_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                queryIndex_ = 0;
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Protobuf.Models.NewsQuery getDefaultInstanceForType() {
                return Protobuf.Models.NewsQuery.getDefaultInstance();
            }

            public Protobuf.Models.NewsQuery build() {
                Protobuf.Models.NewsQuery result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            private Protobuf.Models.NewsQuery buildParsed()
                    throws com.google.protobuf.InvalidProtocolBufferException {
                Protobuf.Models.NewsQuery result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(
                            result).asInvalidProtocolBufferException();
                }
                return result;
            }

            public Protobuf.Models.NewsQuery buildPartial() {
                Protobuf.Models.NewsQuery result = new Protobuf.Models.NewsQuery(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.querySize_ = querySize_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.queryIndex_ = queryIndex_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(Protobuf.Models.NewsQuery other) {
                if (other == Protobuf.Models.NewsQuery.getDefaultInstance()) return this;
                if (other.hasQuerySize()) {
                    setQuerySize(other.getQuerySize());
                }
                if (other.hasQueryIndex()) {
                    setQueryIndex(other.getQueryIndex());
                }
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                while (true) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:

                            return this;
                        default: {
                            if (!parseUnknownField(input, extensionRegistry, tag)) {

                                return this;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            querySize_ = input.readInt32();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            queryIndex_ = input.readInt32();
                            break;
                        }
                    }
                }
            }

            private int bitField0_;

            // optional int32 QuerySize = 1;
            private int querySize_;

            public boolean hasQuerySize() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            public int getQuerySize() {
                return querySize_;
            }

            public Builder setQuerySize(int value) {
                bitField0_ |= 0x00000001;
                querySize_ = value;

                return this;
            }

            public Builder clearQuerySize() {
                bitField0_ = (bitField0_ & ~0x00000001);
                querySize_ = 0;

                return this;
            }

            // optional int32 QueryIndex = 2;
            private int queryIndex_;

            public boolean hasQueryIndex() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }

            public int getQueryIndex() {
                return queryIndex_;
            }

            public Builder setQueryIndex(int value) {
                bitField0_ |= 0x00000002;
                queryIndex_ = value;

                return this;
            }

            public Builder clearQueryIndex() {
                bitField0_ = (bitField0_ & ~0x00000002);
                queryIndex_ = 0;

                return this;
            }

            // @@protoc_insertion_point(builder_scope:NewsQuery)
        }

        static {
            defaultInstance = new NewsQuery(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:NewsQuery)
    }

    public interface NewsListOrBuilder
            extends com.google.protobuf.MessageLiteOrBuilder {

        // optional int32 QuerySize = 1;
        boolean hasQuerySize();

        int getQuerySize();

        // optional int32 QueryIndex = 2;
        boolean hasQueryIndex();

        int getQueryIndex();

        // optional int32 RecordCount = 3;
        boolean hasRecordCount();

        int getRecordCount();

        // optional int32 IndexCount = 4;
        boolean hasIndexCount();

        int getIndexCount();

        // repeated .NewsInfo DataList = 5;
        java.util.List<Protobuf.Models.NewsInfo>
        getDataListList();

        Protobuf.Models.NewsInfo getDataList(int index);

        int getDataListCount();
    }

    public static final class NewsList extends
            com.google.protobuf.GeneratedMessageLite
            implements NewsListOrBuilder {
        // Use NewsList.newBuilder() to construct.
        private NewsList(Builder builder) {
            super(builder);
        }

        private NewsList(boolean noInit) {
        }

        private static final NewsList defaultInstance;

        public static NewsList getDefaultInstance() {
            return defaultInstance;
        }

        public NewsList getDefaultInstanceForType() {
            return defaultInstance;
        }

        private int bitField0_;
        // optional int32 QuerySize = 1;
        public static final int QUERYSIZE_FIELD_NUMBER = 1;
        private int querySize_;

        public boolean hasQuerySize() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        public int getQuerySize() {
            return querySize_;
        }

        // optional int32 QueryIndex = 2;
        public static final int QUERYINDEX_FIELD_NUMBER = 2;
        private int queryIndex_;

        public boolean hasQueryIndex() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        public int getQueryIndex() {
            return queryIndex_;
        }

        // optional int32 RecordCount = 3;
        public static final int RECORDCOUNT_FIELD_NUMBER = 3;
        private int recordCount_;

        public boolean hasRecordCount() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }

        public int getRecordCount() {
            return recordCount_;
        }

        // optional int32 IndexCount = 4;
        public static final int INDEXCOUNT_FIELD_NUMBER = 4;
        private int indexCount_;

        public boolean hasIndexCount() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }

        public int getIndexCount() {
            return indexCount_;
        }

        // repeated .NewsInfo DataList = 5;
        public static final int DATALIST_FIELD_NUMBER = 5;
        private java.util.List<Protobuf.Models.NewsInfo> dataList_;

        public java.util.List<Protobuf.Models.NewsInfo> getDataListList() {
            return dataList_;
        }

        public java.util.List<? extends Protobuf.Models.NewsInfoOrBuilder>
        getDataListOrBuilderList() {
            return dataList_;
        }

        public int getDataListCount() {
            return dataList_.size();
        }

        public Protobuf.Models.NewsInfo getDataList(int index) {
            return dataList_.get(index);
        }

        public Protobuf.Models.NewsInfoOrBuilder getDataListOrBuilder(
                int index) {
            return dataList_.get(index);
        }

        private void initFields() {
            querySize_ = 0;
            queryIndex_ = 0;
            recordCount_ = 0;
            indexCount_ = 0;
            dataList_ = java.util.Collections.emptyList();
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeInt32(1, querySize_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeInt32(2, queryIndex_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeInt32(3, recordCount_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeInt32(4, indexCount_);
            }
            for (int i = 0; i < dataList_.size(); i++) {
                output.writeMessage(5, dataList_.get(i));
            }
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, querySize_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(2, queryIndex_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(3, recordCount_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(4, indexCount_);
            }
            for (int i = 0; i < dataList_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(5, dataList_.get(i));
            }
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Protobuf.Models.NewsList parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.NewsList parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.NewsList parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.NewsList parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.NewsList parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.NewsList parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.NewsList parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.NewsList parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.NewsList parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.NewsList parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Protobuf.Models.NewsList prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends
                com.google.protobuf.GeneratedMessageLite.Builder<
                        Protobuf.Models.NewsList, Builder>
                implements Protobuf.Models.NewsListOrBuilder {
            // Construct using Protobuf.Models.NewsList.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                querySize_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                queryIndex_ = 0;
                bitField0_ = (bitField0_ & ~0x00000002);
                recordCount_ = 0;
                bitField0_ = (bitField0_ & ~0x00000004);
                indexCount_ = 0;
                bitField0_ = (bitField0_ & ~0x00000008);
                dataList_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000010);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Protobuf.Models.NewsList getDefaultInstanceForType() {
                return Protobuf.Models.NewsList.getDefaultInstance();
            }

            public Protobuf.Models.NewsList build() {
                Protobuf.Models.NewsList result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            private Protobuf.Models.NewsList buildParsed()
                    throws com.google.protobuf.InvalidProtocolBufferException {
                Protobuf.Models.NewsList result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(
                            result).asInvalidProtocolBufferException();
                }
                return result;
            }

            public Protobuf.Models.NewsList buildPartial() {
                Protobuf.Models.NewsList result = new Protobuf.Models.NewsList(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.querySize_ = querySize_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.queryIndex_ = queryIndex_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.recordCount_ = recordCount_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.indexCount_ = indexCount_;
                if (((bitField0_ & 0x00000010) == 0x00000010)) {
                    dataList_ = java.util.Collections.unmodifiableList(dataList_);
                    bitField0_ = (bitField0_ & ~0x00000010);
                }
                result.dataList_ = dataList_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(Protobuf.Models.NewsList other) {
                if (other == Protobuf.Models.NewsList.getDefaultInstance()) return this;
                if (other.hasQuerySize()) {
                    setQuerySize(other.getQuerySize());
                }
                if (other.hasQueryIndex()) {
                    setQueryIndex(other.getQueryIndex());
                }
                if (other.hasRecordCount()) {
                    setRecordCount(other.getRecordCount());
                }
                if (other.hasIndexCount()) {
                    setIndexCount(other.getIndexCount());
                }
                if (!other.dataList_.isEmpty()) {
                    if (dataList_.isEmpty()) {
                        dataList_ = other.dataList_;
                        bitField0_ = (bitField0_ & ~0x00000010);
                    } else {
                        ensureDataListIsMutable();
                        dataList_.addAll(other.dataList_);
                    }

                }
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                while (true) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:

                            return this;
                        default: {
                            if (!parseUnknownField(input, extensionRegistry, tag)) {

                                return this;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            querySize_ = input.readInt32();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            queryIndex_ = input.readInt32();
                            break;
                        }
                        case 24: {
                            bitField0_ |= 0x00000004;
                            recordCount_ = input.readInt32();
                            break;
                        }
                        case 32: {
                            bitField0_ |= 0x00000008;
                            indexCount_ = input.readInt32();
                            break;
                        }
                        case 42: {
                            Protobuf.Models.NewsInfo.Builder subBuilder = Protobuf.Models.NewsInfo.newBuilder();
                            input.readMessage(subBuilder, extensionRegistry);
                            addDataList(subBuilder.buildPartial());
                            break;
                        }
                    }
                }
            }

            private int bitField0_;

            // optional int32 QuerySize = 1;
            private int querySize_;

            public boolean hasQuerySize() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            public int getQuerySize() {
                return querySize_;
            }

            public Builder setQuerySize(int value) {
                bitField0_ |= 0x00000001;
                querySize_ = value;

                return this;
            }

            public Builder clearQuerySize() {
                bitField0_ = (bitField0_ & ~0x00000001);
                querySize_ = 0;

                return this;
            }

            // optional int32 QueryIndex = 2;
            private int queryIndex_;

            public boolean hasQueryIndex() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }

            public int getQueryIndex() {
                return queryIndex_;
            }

            public Builder setQueryIndex(int value) {
                bitField0_ |= 0x00000002;
                queryIndex_ = value;

                return this;
            }

            public Builder clearQueryIndex() {
                bitField0_ = (bitField0_ & ~0x00000002);
                queryIndex_ = 0;

                return this;
            }

            // optional int32 RecordCount = 3;
            private int recordCount_;

            public boolean hasRecordCount() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }

            public int getRecordCount() {
                return recordCount_;
            }

            public Builder setRecordCount(int value) {
                bitField0_ |= 0x00000004;
                recordCount_ = value;

                return this;
            }

            public Builder clearRecordCount() {
                bitField0_ = (bitField0_ & ~0x00000004);
                recordCount_ = 0;

                return this;
            }

            // optional int32 IndexCount = 4;
            private int indexCount_;

            public boolean hasIndexCount() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }

            public int getIndexCount() {
                return indexCount_;
            }

            public Builder setIndexCount(int value) {
                bitField0_ |= 0x00000008;
                indexCount_ = value;

                return this;
            }

            public Builder clearIndexCount() {
                bitField0_ = (bitField0_ & ~0x00000008);
                indexCount_ = 0;

                return this;
            }

            // repeated .NewsInfo DataList = 5;
            private java.util.List<Protobuf.Models.NewsInfo> dataList_ =
                    java.util.Collections.emptyList();

            private void ensureDataListIsMutable() {
                if (!((bitField0_ & 0x00000010) == 0x00000010)) {
                    dataList_ = new java.util.ArrayList<Protobuf.Models.NewsInfo>(dataList_);
                    bitField0_ |= 0x00000010;
                }
            }

            public java.util.List<Protobuf.Models.NewsInfo> getDataListList() {
                return java.util.Collections.unmodifiableList(dataList_);
            }

            public int getDataListCount() {
                return dataList_.size();
            }

            public Protobuf.Models.NewsInfo getDataList(int index) {
                return dataList_.get(index);
            }

            public Builder setDataList(
                    int index, Protobuf.Models.NewsInfo value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureDataListIsMutable();
                dataList_.set(index, value);

                return this;
            }

            public Builder setDataList(
                    int index, Protobuf.Models.NewsInfo.Builder builderForValue) {
                ensureDataListIsMutable();
                dataList_.set(index, builderForValue.build());

                return this;
            }

            public Builder addDataList(Protobuf.Models.NewsInfo value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureDataListIsMutable();
                dataList_.add(value);

                return this;
            }

            public Builder addDataList(
                    int index, Protobuf.Models.NewsInfo value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureDataListIsMutable();
                dataList_.add(index, value);

                return this;
            }

            public Builder addDataList(
                    Protobuf.Models.NewsInfo.Builder builderForValue) {
                ensureDataListIsMutable();
                dataList_.add(builderForValue.build());

                return this;
            }

            public Builder addDataList(
                    int index, Protobuf.Models.NewsInfo.Builder builderForValue) {
                ensureDataListIsMutable();
                dataList_.add(index, builderForValue.build());

                return this;
            }

            public Builder addAllDataList(
                    java.lang.Iterable<? extends Protobuf.Models.NewsInfo> values) {
                ensureDataListIsMutable();
                super.addAll(values, dataList_);

                return this;
            }

            public Builder clearDataList() {
                dataList_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000010);

                return this;
            }

            public Builder removeDataList(int index) {
                ensureDataListIsMutable();
                dataList_.remove(index);

                return this;
            }

            // @@protoc_insertion_point(builder_scope:NewsList)
        }

        static {
            defaultInstance = new NewsList(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:NewsList)
    }

    public interface DictQueryOrBuilder
            extends com.google.protobuf.MessageLiteOrBuilder {

        // optional string Text = 1;
        boolean hasText();

        String getText();

        // optional .DictQuery.ResultPart QueryPart = 2 [default = All];
        boolean hasQueryPart();

        Protobuf.Models.DictQuery.ResultPart getQueryPart();

        // optional bool ExtendResult = 3;
        boolean hasExtendResult();

        boolean getExtendResult();
    }

    public static final class DictQuery extends
            com.google.protobuf.GeneratedMessageLite
            implements DictQueryOrBuilder {
        // Use DictQuery.newBuilder() to construct.
        private DictQuery(Builder builder) {
            super(builder);
        }

        private DictQuery(boolean noInit) {
        }

        private static final DictQuery defaultInstance;

        public static DictQuery getDefaultInstance() {
            return defaultInstance;
        }

        public DictQuery getDefaultInstanceForType() {
            return defaultInstance;
        }

        public enum ResultPart
                implements com.google.protobuf.Internal.EnumLite {
            All(0, 0),
            Meaning(1, 1),
            Explication(2, 2),
            Example(3, 3),;

            public static final int All_VALUE = 0;
            public static final int Meaning_VALUE = 1;
            public static final int Explication_VALUE = 2;
            public static final int Example_VALUE = 3;


            public final int getNumber() {
                return value;
            }

            public static ResultPart valueOf(int value) {
                switch (value) {
                    case 0:
                        return All;
                    case 1:
                        return Meaning;
                    case 2:
                        return Explication;
                    case 3:
                        return Example;
                    default:
                        return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<ResultPart>
            internalGetValueMap() {
                return internalValueMap;
            }

            private static com.google.protobuf.Internal.EnumLiteMap<ResultPart>
                    internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<ResultPart>() {
                        public ResultPart findValueByNumber(int number) {
                            return ResultPart.valueOf(number);
                        }
                    };

            private final int value;

            private ResultPart(int index, int value) {
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:DictQuery.ResultPart)
        }

        private int bitField0_;
        // optional string Text = 1;
        public static final int TEXT_FIELD_NUMBER = 1;
        private java.lang.Object text_;

        public boolean hasText() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        public String getText() {
            java.lang.Object ref = text_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    text_ = s;
                }
                return s;
            }
        }

        private com.google.protobuf.ByteString getTextBytes() {
            java.lang.Object ref = text_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                text_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional .DictQuery.ResultPart QueryPart = 2 [default = All];
        public static final int QUERYPART_FIELD_NUMBER = 2;
        private Protobuf.Models.DictQuery.ResultPart queryPart_;

        public boolean hasQueryPart() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        public Protobuf.Models.DictQuery.ResultPart getQueryPart() {
            return queryPart_;
        }

        // optional bool ExtendResult = 3;
        public static final int EXTENDRESULT_FIELD_NUMBER = 3;
        private boolean extendResult_;

        public boolean hasExtendResult() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }

        public boolean getExtendResult() {
            return extendResult_;
        }

        private void initFields() {
            text_ = "";
            queryPart_ = Protobuf.Models.DictQuery.ResultPart.All;
            extendResult_ = false;
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, getTextBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeEnum(2, queryPart_.getNumber());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBool(3, extendResult_);
            }
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(1, getTextBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(2, queryPart_.getNumber());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(3, extendResult_);
            }
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Protobuf.Models.DictQuery parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.DictQuery parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.DictQuery parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.DictQuery parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.DictQuery parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.DictQuery parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.DictQuery parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.DictQuery parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.DictQuery parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.DictQuery parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Protobuf.Models.DictQuery prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends
                com.google.protobuf.GeneratedMessageLite.Builder<
                        Protobuf.Models.DictQuery, Builder>
                implements Protobuf.Models.DictQueryOrBuilder {
            // Construct using Protobuf.Models.DictQuery.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                text_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                queryPart_ = Protobuf.Models.DictQuery.ResultPart.All;
                bitField0_ = (bitField0_ & ~0x00000002);
                extendResult_ = false;
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Protobuf.Models.DictQuery getDefaultInstanceForType() {
                return Protobuf.Models.DictQuery.getDefaultInstance();
            }

            public Protobuf.Models.DictQuery build() {
                Protobuf.Models.DictQuery result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            private Protobuf.Models.DictQuery buildParsed()
                    throws com.google.protobuf.InvalidProtocolBufferException {
                Protobuf.Models.DictQuery result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(
                            result).asInvalidProtocolBufferException();
                }
                return result;
            }

            public Protobuf.Models.DictQuery buildPartial() {
                Protobuf.Models.DictQuery result = new Protobuf.Models.DictQuery(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.text_ = text_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.queryPart_ = queryPart_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.extendResult_ = extendResult_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(Protobuf.Models.DictQuery other) {
                if (other == Protobuf.Models.DictQuery.getDefaultInstance()) return this;
                if (other.hasText()) {
                    setText(other.getText());
                }
                if (other.hasQueryPart()) {
                    setQueryPart(other.getQueryPart());
                }
                if (other.hasExtendResult()) {
                    setExtendResult(other.getExtendResult());
                }
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                while (true) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:

                            return this;
                        default: {
                            if (!parseUnknownField(input, extensionRegistry, tag)) {

                                return this;
                            }
                            break;
                        }
                        case 10: {
                            bitField0_ |= 0x00000001;
                            text_ = input.readBytes();
                            break;
                        }
                        case 16: {
                            int rawValue = input.readEnum();
                            Protobuf.Models.DictQuery.ResultPart value = Protobuf.Models.DictQuery.ResultPart.valueOf(rawValue);
                            if (value != null) {
                                bitField0_ |= 0x00000002;
                                queryPart_ = value;
                            }
                            break;
                        }
                        case 24: {
                            bitField0_ |= 0x00000004;
                            extendResult_ = input.readBool();
                            break;
                        }
                    }
                }
            }

            private int bitField0_;

            // optional string Text = 1;
            private java.lang.Object text_ = "";

            public boolean hasText() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            public String getText() {
                java.lang.Object ref = text_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    text_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            public Builder setText(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                text_ = value;

                return this;
            }

            public Builder clearText() {
                bitField0_ = (bitField0_ & ~0x00000001);
                text_ = getDefaultInstance().getText();

                return this;
            }

            void setText(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000001;
                text_ = value;

            }

            // optional .DictQuery.ResultPart QueryPart = 2 [default = All];
            private Protobuf.Models.DictQuery.ResultPart queryPart_ = Protobuf.Models.DictQuery.ResultPart.All;

            public boolean hasQueryPart() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }

            public Protobuf.Models.DictQuery.ResultPart getQueryPart() {
                return queryPart_;
            }

            public Builder setQueryPart(Protobuf.Models.DictQuery.ResultPart value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                queryPart_ = value;

                return this;
            }

            public Builder clearQueryPart() {
                bitField0_ = (bitField0_ & ~0x00000002);
                queryPart_ = Protobuf.Models.DictQuery.ResultPart.All;

                return this;
            }

            // optional bool ExtendResult = 3;
            private boolean extendResult_;

            public boolean hasExtendResult() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }

            public boolean getExtendResult() {
                return extendResult_;
            }

            public Builder setExtendResult(boolean value) {
                bitField0_ |= 0x00000004;
                extendResult_ = value;

                return this;
            }

            public Builder clearExtendResult() {
                bitField0_ = (bitField0_ & ~0x00000004);
                extendResult_ = false;

                return this;
            }

            // @@protoc_insertion_point(builder_scope:DictQuery)
        }

        static {
            defaultInstance = new DictQuery(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:DictQuery)
    }

    public interface DictResultOrBuilder
            extends com.google.protobuf.MessageLiteOrBuilder {

        // optional .DictResultBasic Basic = 1;
        boolean hasBasic();

        Protobuf.Models.DictResultBasic getBasic();

        // optional .DictResultPortion Extend = 2;
        boolean hasExtend();

        Protobuf.Models.DictResultPortion getExtend();
    }

    public static final class DictResult extends
            com.google.protobuf.GeneratedMessageLite
            implements DictResultOrBuilder {
        // Use DictResult.newBuilder() to construct.
        private DictResult(Builder builder) {
            super(builder);
        }

        private DictResult(boolean noInit) {
        }

        private static final DictResult defaultInstance;

        public static DictResult getDefaultInstance() {
            return defaultInstance;
        }

        public DictResult getDefaultInstanceForType() {
            return defaultInstance;
        }

        private int bitField0_;
        // optional .DictResultBasic Basic = 1;
        public static final int BASIC_FIELD_NUMBER = 1;
        private Protobuf.Models.DictResultBasic basic_;

        public boolean hasBasic() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        public Protobuf.Models.DictResultBasic getBasic() {
            return basic_;
        }

        // optional .DictResultPortion Extend = 2;
        public static final int EXTEND_FIELD_NUMBER = 2;
        private Protobuf.Models.DictResultPortion extend_;

        public boolean hasExtend() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        public Protobuf.Models.DictResultPortion getExtend() {
            return extend_;
        }

        private void initFields() {
            basic_ = Protobuf.Models.DictResultBasic.getDefaultInstance();
            extend_ = Protobuf.Models.DictResultPortion.getDefaultInstance();
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeMessage(1, basic_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeMessage(2, extend_);
            }
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, basic_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, extend_);
            }
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Protobuf.Models.DictResult parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.DictResult parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.DictResult parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.DictResult parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.DictResult parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.DictResult parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.DictResult parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.DictResult parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.DictResult parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.DictResult parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Protobuf.Models.DictResult prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends
                com.google.protobuf.GeneratedMessageLite.Builder<
                        Protobuf.Models.DictResult, Builder>
                implements Protobuf.Models.DictResultOrBuilder {
            // Construct using Protobuf.Models.DictResult.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                basic_ = Protobuf.Models.DictResultBasic.getDefaultInstance();
                bitField0_ = (bitField0_ & ~0x00000001);
                extend_ = Protobuf.Models.DictResultPortion.getDefaultInstance();
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Protobuf.Models.DictResult getDefaultInstanceForType() {
                return Protobuf.Models.DictResult.getDefaultInstance();
            }

            public Protobuf.Models.DictResult build() {
                Protobuf.Models.DictResult result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            private Protobuf.Models.DictResult buildParsed()
                    throws com.google.protobuf.InvalidProtocolBufferException {
                Protobuf.Models.DictResult result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(
                            result).asInvalidProtocolBufferException();
                }
                return result;
            }

            public Protobuf.Models.DictResult buildPartial() {
                Protobuf.Models.DictResult result = new Protobuf.Models.DictResult(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.basic_ = basic_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.extend_ = extend_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(Protobuf.Models.DictResult other) {
                if (other == Protobuf.Models.DictResult.getDefaultInstance()) return this;
                if (other.hasBasic()) {
                    mergeBasic(other.getBasic());
                }
                if (other.hasExtend()) {
                    mergeExtend(other.getExtend());
                }
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                while (true) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:

                            return this;
                        default: {
                            if (!parseUnknownField(input, extensionRegistry, tag)) {

                                return this;
                            }
                            break;
                        }
                        case 10: {
                            Protobuf.Models.DictResultBasic.Builder subBuilder = Protobuf.Models.DictResultBasic.newBuilder();
                            if (hasBasic()) {
                                subBuilder.mergeFrom(getBasic());
                            }
                            input.readMessage(subBuilder, extensionRegistry);
                            setBasic(subBuilder.buildPartial());
                            break;
                        }
                        case 18: {
                            Protobuf.Models.DictResultPortion.Builder subBuilder = Protobuf.Models.DictResultPortion.newBuilder();
                            if (hasExtend()) {
                                subBuilder.mergeFrom(getExtend());
                            }
                            input.readMessage(subBuilder, extensionRegistry);
                            setExtend(subBuilder.buildPartial());
                            break;
                        }
                    }
                }
            }

            private int bitField0_;

            // optional .DictResultBasic Basic = 1;
            private Protobuf.Models.DictResultBasic basic_ = Protobuf.Models.DictResultBasic.getDefaultInstance();

            public boolean hasBasic() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            public Protobuf.Models.DictResultBasic getBasic() {
                return basic_;
            }

            public Builder setBasic(Protobuf.Models.DictResultBasic value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                basic_ = value;

                bitField0_ |= 0x00000001;
                return this;
            }

            public Builder setBasic(
                    Protobuf.Models.DictResultBasic.Builder builderForValue) {
                basic_ = builderForValue.build();

                bitField0_ |= 0x00000001;
                return this;
            }

            public Builder mergeBasic(Protobuf.Models.DictResultBasic value) {
                if (((bitField0_ & 0x00000001) == 0x00000001) &&
                        basic_ != Protobuf.Models.DictResultBasic.getDefaultInstance()) {
                    basic_ =
                            Protobuf.Models.DictResultBasic.newBuilder(basic_).mergeFrom(value).buildPartial();
                } else {
                    basic_ = value;
                }

                bitField0_ |= 0x00000001;
                return this;
            }

            public Builder clearBasic() {
                basic_ = Protobuf.Models.DictResultBasic.getDefaultInstance();

                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }

            // optional .DictResultPortion Extend = 2;
            private Protobuf.Models.DictResultPortion extend_ = Protobuf.Models.DictResultPortion.getDefaultInstance();

            public boolean hasExtend() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }

            public Protobuf.Models.DictResultPortion getExtend() {
                return extend_;
            }

            public Builder setExtend(Protobuf.Models.DictResultPortion value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                extend_ = value;

                bitField0_ |= 0x00000002;
                return this;
            }

            public Builder setExtend(
                    Protobuf.Models.DictResultPortion.Builder builderForValue) {
                extend_ = builderForValue.build();

                bitField0_ |= 0x00000002;
                return this;
            }

            public Builder mergeExtend(Protobuf.Models.DictResultPortion value) {
                if (((bitField0_ & 0x00000002) == 0x00000002) &&
                        extend_ != Protobuf.Models.DictResultPortion.getDefaultInstance()) {
                    extend_ =
                            Protobuf.Models.DictResultPortion.newBuilder(extend_).mergeFrom(value).buildPartial();
                } else {
                    extend_ = value;
                }

                bitField0_ |= 0x00000002;
                return this;
            }

            public Builder clearExtend() {
                extend_ = Protobuf.Models.DictResultPortion.getDefaultInstance();

                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            // @@protoc_insertion_point(builder_scope:DictResult)
        }

        static {
            defaultInstance = new DictResult(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:DictResult)
    }

    public interface DictResultBasicOrBuilder
            extends com.google.protobuf.MessageLiteOrBuilder {

        // optional string Text = 1;
        boolean hasText();

        String getText();

        // optional string PhonicsEn = 2;
        boolean hasPhonicsEn();

        String getPhonicsEn();

        // optional string AudioEn = 3;
        boolean hasAudioEn();

        String getAudioEn();

        // optional string PhonicsUs = 4;
        boolean hasPhonicsUs();

        String getPhonicsUs();

        // optional string AudioUs = 5;
        boolean hasAudioUs();

        String getAudioUs();

        // repeated .DictResultPackage Meaning = 6;
        java.util.List<Protobuf.Models.DictResultPackage>
        getMeaningList();

        Protobuf.Models.DictResultPackage getMeaning(int index);

        int getMeaningCount();

        // repeated .DictResultPackage Example = 7;
        java.util.List<Protobuf.Models.DictResultPackage>
        getExampleList();

        Protobuf.Models.DictResultPackage getExample(int index);

        int getExampleCount();

        // repeated .DictResultPackage Explication = 8;
        java.util.List<Protobuf.Models.DictResultPackage>
        getExplicationList();

        Protobuf.Models.DictResultPackage getExplication(int index);

        int getExplicationCount();
    }

    public static final class DictResultBasic extends
            com.google.protobuf.GeneratedMessageLite
            implements DictResultBasicOrBuilder {
        // Use DictResultBasic.newBuilder() to construct.
        private DictResultBasic(Builder builder) {
            super(builder);
        }

        private DictResultBasic(boolean noInit) {
        }

        private static final DictResultBasic defaultInstance;

        public static DictResultBasic getDefaultInstance() {
            return defaultInstance;
        }

        public DictResultBasic getDefaultInstanceForType() {
            return defaultInstance;
        }

        private int bitField0_;
        // optional string Text = 1;
        public static final int TEXT_FIELD_NUMBER = 1;
        private java.lang.Object text_;

        public boolean hasText() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        public String getText() {
            java.lang.Object ref = text_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    text_ = s;
                }
                return s;
            }
        }

        private com.google.protobuf.ByteString getTextBytes() {
            java.lang.Object ref = text_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                text_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional string PhonicsEn = 2;
        public static final int PHONICSEN_FIELD_NUMBER = 2;
        private java.lang.Object phonicsEn_;

        public boolean hasPhonicsEn() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        public String getPhonicsEn() {
            java.lang.Object ref = phonicsEn_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    phonicsEn_ = s;
                }
                return s;
            }
        }

        private com.google.protobuf.ByteString getPhonicsEnBytes() {
            java.lang.Object ref = phonicsEn_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                phonicsEn_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional string AudioEn = 3;
        public static final int AUDIOEN_FIELD_NUMBER = 3;
        private java.lang.Object audioEn_;

        public boolean hasAudioEn() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }

        public String getAudioEn() {
            java.lang.Object ref = audioEn_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    audioEn_ = s;
                }
                return s;
            }
        }

        private com.google.protobuf.ByteString getAudioEnBytes() {
            java.lang.Object ref = audioEn_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                audioEn_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional string PhonicsUs = 4;
        public static final int PHONICSUS_FIELD_NUMBER = 4;
        private java.lang.Object phonicsUs_;

        public boolean hasPhonicsUs() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }

        public String getPhonicsUs() {
            java.lang.Object ref = phonicsUs_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    phonicsUs_ = s;
                }
                return s;
            }
        }

        private com.google.protobuf.ByteString getPhonicsUsBytes() {
            java.lang.Object ref = phonicsUs_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                phonicsUs_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional string AudioUs = 5;
        public static final int AUDIOUS_FIELD_NUMBER = 5;
        private java.lang.Object audioUs_;

        public boolean hasAudioUs() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }

        public String getAudioUs() {
            java.lang.Object ref = audioUs_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    audioUs_ = s;
                }
                return s;
            }
        }

        private com.google.protobuf.ByteString getAudioUsBytes() {
            java.lang.Object ref = audioUs_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                audioUs_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // repeated .DictResultPackage Meaning = 6;
        public static final int MEANING_FIELD_NUMBER = 6;
        private java.util.List<Protobuf.Models.DictResultPackage> meaning_;

        public java.util.List<Protobuf.Models.DictResultPackage> getMeaningList() {
            return meaning_;
        }

        public java.util.List<? extends Protobuf.Models.DictResultPackageOrBuilder>
        getMeaningOrBuilderList() {
            return meaning_;
        }

        public int getMeaningCount() {
            return meaning_.size();
        }

        public Protobuf.Models.DictResultPackage getMeaning(int index) {
            return meaning_.get(index);
        }

        public Protobuf.Models.DictResultPackageOrBuilder getMeaningOrBuilder(
                int index) {
            return meaning_.get(index);
        }

        // repeated .DictResultPackage Example = 7;
        public static final int EXAMPLE_FIELD_NUMBER = 7;
        private java.util.List<Protobuf.Models.DictResultPackage> example_;

        public java.util.List<Protobuf.Models.DictResultPackage> getExampleList() {
            return example_;
        }

        public java.util.List<? extends Protobuf.Models.DictResultPackageOrBuilder>
        getExampleOrBuilderList() {
            return example_;
        }

        public int getExampleCount() {
            return example_.size();
        }

        public Protobuf.Models.DictResultPackage getExample(int index) {
            return example_.get(index);
        }

        public Protobuf.Models.DictResultPackageOrBuilder getExampleOrBuilder(
                int index) {
            return example_.get(index);
        }

        // repeated .DictResultPackage Explication = 8;
        public static final int EXPLICATION_FIELD_NUMBER = 8;
        private java.util.List<Protobuf.Models.DictResultPackage> explication_;

        public java.util.List<Protobuf.Models.DictResultPackage> getExplicationList() {
            return explication_;
        }

        public java.util.List<? extends Protobuf.Models.DictResultPackageOrBuilder>
        getExplicationOrBuilderList() {
            return explication_;
        }

        public int getExplicationCount() {
            return explication_.size();
        }

        public Protobuf.Models.DictResultPackage getExplication(int index) {
            return explication_.get(index);
        }

        public Protobuf.Models.DictResultPackageOrBuilder getExplicationOrBuilder(
                int index) {
            return explication_.get(index);
        }

        private void initFields() {
            text_ = "";
            phonicsEn_ = "";
            audioEn_ = "";
            phonicsUs_ = "";
            audioUs_ = "";
            meaning_ = java.util.Collections.emptyList();
            example_ = java.util.Collections.emptyList();
            explication_ = java.util.Collections.emptyList();
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, getTextBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, getPhonicsEnBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBytes(3, getAudioEnBytes());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeBytes(4, getPhonicsUsBytes());
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                output.writeBytes(5, getAudioUsBytes());
            }
            for (int i = 0; i < meaning_.size(); i++) {
                output.writeMessage(6, meaning_.get(i));
            }
            for (int i = 0; i < example_.size(); i++) {
                output.writeMessage(7, example_.get(i));
            }
            for (int i = 0; i < explication_.size(); i++) {
                output.writeMessage(8, explication_.get(i));
            }
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(1, getTextBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, getPhonicsEnBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(3, getAudioEnBytes());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(4, getPhonicsUsBytes());
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(5, getAudioUsBytes());
            }
            for (int i = 0; i < meaning_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(6, meaning_.get(i));
            }
            for (int i = 0; i < example_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(7, example_.get(i));
            }
            for (int i = 0; i < explication_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(8, explication_.get(i));
            }
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Protobuf.Models.DictResultBasic parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.DictResultBasic parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.DictResultBasic parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.DictResultBasic parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.DictResultBasic parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.DictResultBasic parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.DictResultBasic parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.DictResultBasic parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.DictResultBasic parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.DictResultBasic parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Protobuf.Models.DictResultBasic prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends
                com.google.protobuf.GeneratedMessageLite.Builder<
                        Protobuf.Models.DictResultBasic, Builder>
                implements Protobuf.Models.DictResultBasicOrBuilder {
            // Construct using Protobuf.Models.DictResultBasic.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                text_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                phonicsEn_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                audioEn_ = "";
                bitField0_ = (bitField0_ & ~0x00000004);
                phonicsUs_ = "";
                bitField0_ = (bitField0_ & ~0x00000008);
                audioUs_ = "";
                bitField0_ = (bitField0_ & ~0x00000010);
                meaning_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000020);
                example_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000040);
                explication_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000080);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Protobuf.Models.DictResultBasic getDefaultInstanceForType() {
                return Protobuf.Models.DictResultBasic.getDefaultInstance();
            }

            public Protobuf.Models.DictResultBasic build() {
                Protobuf.Models.DictResultBasic result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            private Protobuf.Models.DictResultBasic buildParsed()
                    throws com.google.protobuf.InvalidProtocolBufferException {
                Protobuf.Models.DictResultBasic result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(
                            result).asInvalidProtocolBufferException();
                }
                return result;
            }

            public Protobuf.Models.DictResultBasic buildPartial() {
                Protobuf.Models.DictResultBasic result = new Protobuf.Models.DictResultBasic(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.text_ = text_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.phonicsEn_ = phonicsEn_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.audioEn_ = audioEn_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.phonicsUs_ = phonicsUs_;
                if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                    to_bitField0_ |= 0x00000010;
                }
                result.audioUs_ = audioUs_;
                if (((bitField0_ & 0x00000020) == 0x00000020)) {
                    meaning_ = java.util.Collections.unmodifiableList(meaning_);
                    bitField0_ = (bitField0_ & ~0x00000020);
                }
                result.meaning_ = meaning_;
                if (((bitField0_ & 0x00000040) == 0x00000040)) {
                    example_ = java.util.Collections.unmodifiableList(example_);
                    bitField0_ = (bitField0_ & ~0x00000040);
                }
                result.example_ = example_;
                if (((bitField0_ & 0x00000080) == 0x00000080)) {
                    explication_ = java.util.Collections.unmodifiableList(explication_);
                    bitField0_ = (bitField0_ & ~0x00000080);
                }
                result.explication_ = explication_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(Protobuf.Models.DictResultBasic other) {
                if (other == Protobuf.Models.DictResultBasic.getDefaultInstance()) return this;
                if (other.hasText()) {
                    setText(other.getText());
                }
                if (other.hasPhonicsEn()) {
                    setPhonicsEn(other.getPhonicsEn());
                }
                if (other.hasAudioEn()) {
                    setAudioEn(other.getAudioEn());
                }
                if (other.hasPhonicsUs()) {
                    setPhonicsUs(other.getPhonicsUs());
                }
                if (other.hasAudioUs()) {
                    setAudioUs(other.getAudioUs());
                }
                if (!other.meaning_.isEmpty()) {
                    if (meaning_.isEmpty()) {
                        meaning_ = other.meaning_;
                        bitField0_ = (bitField0_ & ~0x00000020);
                    } else {
                        ensureMeaningIsMutable();
                        meaning_.addAll(other.meaning_);
                    }

                }
                if (!other.example_.isEmpty()) {
                    if (example_.isEmpty()) {
                        example_ = other.example_;
                        bitField0_ = (bitField0_ & ~0x00000040);
                    } else {
                        ensureExampleIsMutable();
                        example_.addAll(other.example_);
                    }

                }
                if (!other.explication_.isEmpty()) {
                    if (explication_.isEmpty()) {
                        explication_ = other.explication_;
                        bitField0_ = (bitField0_ & ~0x00000080);
                    } else {
                        ensureExplicationIsMutable();
                        explication_.addAll(other.explication_);
                    }

                }
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                while (true) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:

                            return this;
                        default: {
                            if (!parseUnknownField(input, extensionRegistry, tag)) {

                                return this;
                            }
                            break;
                        }
                        case 10: {
                            bitField0_ |= 0x00000001;
                            text_ = input.readBytes();
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            phonicsEn_ = input.readBytes();
                            break;
                        }
                        case 26: {
                            bitField0_ |= 0x00000004;
                            audioEn_ = input.readBytes();
                            break;
                        }
                        case 34: {
                            bitField0_ |= 0x00000008;
                            phonicsUs_ = input.readBytes();
                            break;
                        }
                        case 42: {
                            bitField0_ |= 0x00000010;
                            audioUs_ = input.readBytes();
                            break;
                        }
                        case 50: {
                            Protobuf.Models.DictResultPackage.Builder subBuilder = Protobuf.Models.DictResultPackage.newBuilder();
                            input.readMessage(subBuilder, extensionRegistry);
                            addMeaning(subBuilder.buildPartial());
                            break;
                        }
                        case 58: {
                            Protobuf.Models.DictResultPackage.Builder subBuilder = Protobuf.Models.DictResultPackage.newBuilder();
                            input.readMessage(subBuilder, extensionRegistry);
                            addExample(subBuilder.buildPartial());
                            break;
                        }
                        case 66: {
                            Protobuf.Models.DictResultPackage.Builder subBuilder = Protobuf.Models.DictResultPackage.newBuilder();
                            input.readMessage(subBuilder, extensionRegistry);
                            addExplication(subBuilder.buildPartial());
                            break;
                        }
                    }
                }
            }

            private int bitField0_;

            // optional string Text = 1;
            private java.lang.Object text_ = "";

            public boolean hasText() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            public String getText() {
                java.lang.Object ref = text_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    text_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            public Builder setText(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                text_ = value;

                return this;
            }

            public Builder clearText() {
                bitField0_ = (bitField0_ & ~0x00000001);
                text_ = getDefaultInstance().getText();

                return this;
            }

            void setText(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000001;
                text_ = value;

            }

            // optional string PhonicsEn = 2;
            private java.lang.Object phonicsEn_ = "";

            public boolean hasPhonicsEn() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }

            public String getPhonicsEn() {
                java.lang.Object ref = phonicsEn_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    phonicsEn_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            public Builder setPhonicsEn(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                phonicsEn_ = value;

                return this;
            }

            public Builder clearPhonicsEn() {
                bitField0_ = (bitField0_ & ~0x00000002);
                phonicsEn_ = getDefaultInstance().getPhonicsEn();

                return this;
            }

            void setPhonicsEn(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000002;
                phonicsEn_ = value;

            }

            // optional string AudioEn = 3;
            private java.lang.Object audioEn_ = "";

            public boolean hasAudioEn() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }

            public String getAudioEn() {
                java.lang.Object ref = audioEn_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    audioEn_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            public Builder setAudioEn(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                audioEn_ = value;

                return this;
            }

            public Builder clearAudioEn() {
                bitField0_ = (bitField0_ & ~0x00000004);
                audioEn_ = getDefaultInstance().getAudioEn();

                return this;
            }

            void setAudioEn(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000004;
                audioEn_ = value;

            }

            // optional string PhonicsUs = 4;
            private java.lang.Object phonicsUs_ = "";

            public boolean hasPhonicsUs() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }

            public String getPhonicsUs() {
                java.lang.Object ref = phonicsUs_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    phonicsUs_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            public Builder setPhonicsUs(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                phonicsUs_ = value;

                return this;
            }

            public Builder clearPhonicsUs() {
                bitField0_ = (bitField0_ & ~0x00000008);
                phonicsUs_ = getDefaultInstance().getPhonicsUs();

                return this;
            }

            void setPhonicsUs(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000008;
                phonicsUs_ = value;

            }

            // optional string AudioUs = 5;
            private java.lang.Object audioUs_ = "";

            public boolean hasAudioUs() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }

            public String getAudioUs() {
                java.lang.Object ref = audioUs_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    audioUs_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            public Builder setAudioUs(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000010;
                audioUs_ = value;

                return this;
            }

            public Builder clearAudioUs() {
                bitField0_ = (bitField0_ & ~0x00000010);
                audioUs_ = getDefaultInstance().getAudioUs();

                return this;
            }

            void setAudioUs(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000010;
                audioUs_ = value;

            }

            // repeated .DictResultPackage Meaning = 6;
            private java.util.List<Protobuf.Models.DictResultPackage> meaning_ =
                    java.util.Collections.emptyList();

            private void ensureMeaningIsMutable() {
                if (!((bitField0_ & 0x00000020) == 0x00000020)) {
                    meaning_ = new java.util.ArrayList<Protobuf.Models.DictResultPackage>(meaning_);
                    bitField0_ |= 0x00000020;
                }
            }

            public java.util.List<Protobuf.Models.DictResultPackage> getMeaningList() {
                return java.util.Collections.unmodifiableList(meaning_);
            }

            public int getMeaningCount() {
                return meaning_.size();
            }

            public Protobuf.Models.DictResultPackage getMeaning(int index) {
                return meaning_.get(index);
            }

            public Builder setMeaning(
                    int index, Protobuf.Models.DictResultPackage value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureMeaningIsMutable();
                meaning_.set(index, value);

                return this;
            }

            public Builder setMeaning(
                    int index, Protobuf.Models.DictResultPackage.Builder builderForValue) {
                ensureMeaningIsMutable();
                meaning_.set(index, builderForValue.build());

                return this;
            }

            public Builder addMeaning(Protobuf.Models.DictResultPackage value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureMeaningIsMutable();
                meaning_.add(value);

                return this;
            }

            public Builder addMeaning(
                    int index, Protobuf.Models.DictResultPackage value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureMeaningIsMutable();
                meaning_.add(index, value);

                return this;
            }

            public Builder addMeaning(
                    Protobuf.Models.DictResultPackage.Builder builderForValue) {
                ensureMeaningIsMutable();
                meaning_.add(builderForValue.build());

                return this;
            }

            public Builder addMeaning(
                    int index, Protobuf.Models.DictResultPackage.Builder builderForValue) {
                ensureMeaningIsMutable();
                meaning_.add(index, builderForValue.build());

                return this;
            }

            public Builder addAllMeaning(
                    java.lang.Iterable<? extends Protobuf.Models.DictResultPackage> values) {
                ensureMeaningIsMutable();
                super.addAll(values, meaning_);

                return this;
            }

            public Builder clearMeaning() {
                meaning_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000020);

                return this;
            }

            public Builder removeMeaning(int index) {
                ensureMeaningIsMutable();
                meaning_.remove(index);

                return this;
            }

            // repeated .DictResultPackage Example = 7;
            private java.util.List<Protobuf.Models.DictResultPackage> example_ =
                    java.util.Collections.emptyList();

            private void ensureExampleIsMutable() {
                if (!((bitField0_ & 0x00000040) == 0x00000040)) {
                    example_ = new java.util.ArrayList<Protobuf.Models.DictResultPackage>(example_);
                    bitField0_ |= 0x00000040;
                }
            }

            public java.util.List<Protobuf.Models.DictResultPackage> getExampleList() {
                return java.util.Collections.unmodifiableList(example_);
            }

            public int getExampleCount() {
                return example_.size();
            }

            public Protobuf.Models.DictResultPackage getExample(int index) {
                return example_.get(index);
            }

            public Builder setExample(
                    int index, Protobuf.Models.DictResultPackage value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureExampleIsMutable();
                example_.set(index, value);

                return this;
            }

            public Builder setExample(
                    int index, Protobuf.Models.DictResultPackage.Builder builderForValue) {
                ensureExampleIsMutable();
                example_.set(index, builderForValue.build());

                return this;
            }

            public Builder addExample(Protobuf.Models.DictResultPackage value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureExampleIsMutable();
                example_.add(value);

                return this;
            }

            public Builder addExample(
                    int index, Protobuf.Models.DictResultPackage value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureExampleIsMutable();
                example_.add(index, value);

                return this;
            }

            public Builder addExample(
                    Protobuf.Models.DictResultPackage.Builder builderForValue) {
                ensureExampleIsMutable();
                example_.add(builderForValue.build());

                return this;
            }

            public Builder addExample(
                    int index, Protobuf.Models.DictResultPackage.Builder builderForValue) {
                ensureExampleIsMutable();
                example_.add(index, builderForValue.build());

                return this;
            }

            public Builder addAllExample(
                    java.lang.Iterable<? extends Protobuf.Models.DictResultPackage> values) {
                ensureExampleIsMutable();
                super.addAll(values, example_);

                return this;
            }

            public Builder clearExample() {
                example_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000040);

                return this;
            }

            public Builder removeExample(int index) {
                ensureExampleIsMutable();
                example_.remove(index);

                return this;
            }

            // repeated .DictResultPackage Explication = 8;
            private java.util.List<Protobuf.Models.DictResultPackage> explication_ =
                    java.util.Collections.emptyList();

            private void ensureExplicationIsMutable() {
                if (!((bitField0_ & 0x00000080) == 0x00000080)) {
                    explication_ = new java.util.ArrayList<Protobuf.Models.DictResultPackage>(explication_);
                    bitField0_ |= 0x00000080;
                }
            }

            public java.util.List<Protobuf.Models.DictResultPackage> getExplicationList() {
                return java.util.Collections.unmodifiableList(explication_);
            }

            public int getExplicationCount() {
                return explication_.size();
            }

            public Protobuf.Models.DictResultPackage getExplication(int index) {
                return explication_.get(index);
            }

            public Builder setExplication(
                    int index, Protobuf.Models.DictResultPackage value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureExplicationIsMutable();
                explication_.set(index, value);

                return this;
            }

            public Builder setExplication(
                    int index, Protobuf.Models.DictResultPackage.Builder builderForValue) {
                ensureExplicationIsMutable();
                explication_.set(index, builderForValue.build());

                return this;
            }

            public Builder addExplication(Protobuf.Models.DictResultPackage value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureExplicationIsMutable();
                explication_.add(value);

                return this;
            }

            public Builder addExplication(
                    int index, Protobuf.Models.DictResultPackage value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureExplicationIsMutable();
                explication_.add(index, value);

                return this;
            }

            public Builder addExplication(
                    Protobuf.Models.DictResultPackage.Builder builderForValue) {
                ensureExplicationIsMutable();
                explication_.add(builderForValue.build());

                return this;
            }

            public Builder addExplication(
                    int index, Protobuf.Models.DictResultPackage.Builder builderForValue) {
                ensureExplicationIsMutable();
                explication_.add(index, builderForValue.build());

                return this;
            }

            public Builder addAllExplication(
                    java.lang.Iterable<? extends Protobuf.Models.DictResultPackage> values) {
                ensureExplicationIsMutable();
                super.addAll(values, explication_);

                return this;
            }

            public Builder clearExplication() {
                explication_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000080);

                return this;
            }

            public Builder removeExplication(int index) {
                ensureExplicationIsMutable();
                explication_.remove(index);

                return this;
            }

            // @@protoc_insertion_point(builder_scope:DictResultBasic)
        }

        static {
            defaultInstance = new DictResultBasic(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:DictResultBasic)
    }

    public interface DictResultPackageOrBuilder
            extends com.google.protobuf.MessageLiteOrBuilder {

        // optional string PackageName = 1;
        boolean hasPackageName();

        String getPackageName();

        // repeated .DictResultPortion PackageData = 2;
        java.util.List<Protobuf.Models.DictResultPortion>
        getPackageDataList();

        Protobuf.Models.DictResultPortion getPackageData(int index);

        int getPackageDataCount();
    }

    public static final class DictResultPackage extends
            com.google.protobuf.GeneratedMessageLite
            implements DictResultPackageOrBuilder {
        // Use DictResultPackage.newBuilder() to construct.
        private DictResultPackage(Builder builder) {
            super(builder);
        }

        private DictResultPackage(boolean noInit) {
        }

        private static final DictResultPackage defaultInstance;

        public static DictResultPackage getDefaultInstance() {
            return defaultInstance;
        }

        public DictResultPackage getDefaultInstanceForType() {
            return defaultInstance;
        }

        private int bitField0_;
        // optional string PackageName = 1;
        public static final int PACKAGENAME_FIELD_NUMBER = 1;
        private java.lang.Object packageName_;

        public boolean hasPackageName() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        public String getPackageName() {
            java.lang.Object ref = packageName_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    packageName_ = s;
                }
                return s;
            }
        }

        private com.google.protobuf.ByteString getPackageNameBytes() {
            java.lang.Object ref = packageName_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                packageName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // repeated .DictResultPortion PackageData = 2;
        public static final int PACKAGEDATA_FIELD_NUMBER = 2;
        private java.util.List<Protobuf.Models.DictResultPortion> packageData_;

        public java.util.List<Protobuf.Models.DictResultPortion> getPackageDataList() {
            return packageData_;
        }

        public java.util.List<? extends Protobuf.Models.DictResultPortionOrBuilder>
        getPackageDataOrBuilderList() {
            return packageData_;
        }

        public int getPackageDataCount() {
            return packageData_.size();
        }

        public Protobuf.Models.DictResultPortion getPackageData(int index) {
            return packageData_.get(index);
        }

        public Protobuf.Models.DictResultPortionOrBuilder getPackageDataOrBuilder(
                int index) {
            return packageData_.get(index);
        }

        private void initFields() {
            packageName_ = "";
            packageData_ = java.util.Collections.emptyList();
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, getPackageNameBytes());
            }
            for (int i = 0; i < packageData_.size(); i++) {
                output.writeMessage(2, packageData_.get(i));
            }
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(1, getPackageNameBytes());
            }
            for (int i = 0; i < packageData_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, packageData_.get(i));
            }
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Protobuf.Models.DictResultPackage parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.DictResultPackage parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.DictResultPackage parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.DictResultPackage parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.DictResultPackage parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.DictResultPackage parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.DictResultPackage parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.DictResultPackage parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.DictResultPackage parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.DictResultPackage parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Protobuf.Models.DictResultPackage prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends
                com.google.protobuf.GeneratedMessageLite.Builder<
                        Protobuf.Models.DictResultPackage, Builder>
                implements Protobuf.Models.DictResultPackageOrBuilder {
            // Construct using Protobuf.Models.DictResultPackage.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                packageName_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                packageData_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Protobuf.Models.DictResultPackage getDefaultInstanceForType() {
                return Protobuf.Models.DictResultPackage.getDefaultInstance();
            }

            public Protobuf.Models.DictResultPackage build() {
                Protobuf.Models.DictResultPackage result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            private Protobuf.Models.DictResultPackage buildParsed()
                    throws com.google.protobuf.InvalidProtocolBufferException {
                Protobuf.Models.DictResultPackage result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(
                            result).asInvalidProtocolBufferException();
                }
                return result;
            }

            public Protobuf.Models.DictResultPackage buildPartial() {
                Protobuf.Models.DictResultPackage result = new Protobuf.Models.DictResultPackage(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.packageName_ = packageName_;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    packageData_ = java.util.Collections.unmodifiableList(packageData_);
                    bitField0_ = (bitField0_ & ~0x00000002);
                }
                result.packageData_ = packageData_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(Protobuf.Models.DictResultPackage other) {
                if (other == Protobuf.Models.DictResultPackage.getDefaultInstance()) return this;
                if (other.hasPackageName()) {
                    setPackageName(other.getPackageName());
                }
                if (!other.packageData_.isEmpty()) {
                    if (packageData_.isEmpty()) {
                        packageData_ = other.packageData_;
                        bitField0_ = (bitField0_ & ~0x00000002);
                    } else {
                        ensurePackageDataIsMutable();
                        packageData_.addAll(other.packageData_);
                    }

                }
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                while (true) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:

                            return this;
                        default: {
                            if (!parseUnknownField(input, extensionRegistry, tag)) {

                                return this;
                            }
                            break;
                        }
                        case 10: {
                            bitField0_ |= 0x00000001;
                            packageName_ = input.readBytes();
                            break;
                        }
                        case 18: {
                            Protobuf.Models.DictResultPortion.Builder subBuilder = Protobuf.Models.DictResultPortion.newBuilder();
                            input.readMessage(subBuilder, extensionRegistry);
                            addPackageData(subBuilder.buildPartial());
                            break;
                        }
                    }
                }
            }

            private int bitField0_;

            // optional string PackageName = 1;
            private java.lang.Object packageName_ = "";

            public boolean hasPackageName() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            public String getPackageName() {
                java.lang.Object ref = packageName_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    packageName_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            public Builder setPackageName(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                packageName_ = value;

                return this;
            }

            public Builder clearPackageName() {
                bitField0_ = (bitField0_ & ~0x00000001);
                packageName_ = getDefaultInstance().getPackageName();

                return this;
            }

            void setPackageName(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000001;
                packageName_ = value;

            }

            // repeated .DictResultPortion PackageData = 2;
            private java.util.List<Protobuf.Models.DictResultPortion> packageData_ =
                    java.util.Collections.emptyList();

            private void ensurePackageDataIsMutable() {
                if (!((bitField0_ & 0x00000002) == 0x00000002)) {
                    packageData_ = new java.util.ArrayList<Protobuf.Models.DictResultPortion>(packageData_);
                    bitField0_ |= 0x00000002;
                }
            }

            public java.util.List<Protobuf.Models.DictResultPortion> getPackageDataList() {
                return java.util.Collections.unmodifiableList(packageData_);
            }

            public int getPackageDataCount() {
                return packageData_.size();
            }

            public Protobuf.Models.DictResultPortion getPackageData(int index) {
                return packageData_.get(index);
            }

            public Builder setPackageData(
                    int index, Protobuf.Models.DictResultPortion value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensurePackageDataIsMutable();
                packageData_.set(index, value);

                return this;
            }

            public Builder setPackageData(
                    int index, Protobuf.Models.DictResultPortion.Builder builderForValue) {
                ensurePackageDataIsMutable();
                packageData_.set(index, builderForValue.build());

                return this;
            }

            public Builder addPackageData(Protobuf.Models.DictResultPortion value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensurePackageDataIsMutable();
                packageData_.add(value);

                return this;
            }

            public Builder addPackageData(
                    int index, Protobuf.Models.DictResultPortion value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensurePackageDataIsMutable();
                packageData_.add(index, value);

                return this;
            }

            public Builder addPackageData(
                    Protobuf.Models.DictResultPortion.Builder builderForValue) {
                ensurePackageDataIsMutable();
                packageData_.add(builderForValue.build());

                return this;
            }

            public Builder addPackageData(
                    int index, Protobuf.Models.DictResultPortion.Builder builderForValue) {
                ensurePackageDataIsMutable();
                packageData_.add(index, builderForValue.build());

                return this;
            }

            public Builder addAllPackageData(
                    java.lang.Iterable<? extends Protobuf.Models.DictResultPortion> values) {
                ensurePackageDataIsMutable();
                super.addAll(values, packageData_);

                return this;
            }

            public Builder clearPackageData() {
                packageData_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000002);

                return this;
            }

            public Builder removePackageData(int index) {
                ensurePackageDataIsMutable();
                packageData_.remove(index);

                return this;
            }

            // @@protoc_insertion_point(builder_scope:DictResultPackage)
        }

        static {
            defaultInstance = new DictResultPackage(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:DictResultPackage)
    }

    public interface DictResultPortionOrBuilder
            extends com.google.protobuf.MessageLiteOrBuilder {

        // optional string Title = 1;
        boolean hasTitle();

        String getTitle();

        // repeated .DictResultItem Items = 2;
        java.util.List<Protobuf.Models.DictResultItem>
        getItemsList();

        Protobuf.Models.DictResultItem getItems(int index);

        int getItemsCount();
    }

    public static final class DictResultPortion extends
            com.google.protobuf.GeneratedMessageLite
            implements DictResultPortionOrBuilder {
        // Use DictResultPortion.newBuilder() to construct.
        private DictResultPortion(Builder builder) {
            super(builder);
        }

        private DictResultPortion(boolean noInit) {
        }

        private static final DictResultPortion defaultInstance;

        public static DictResultPortion getDefaultInstance() {
            return defaultInstance;
        }

        public DictResultPortion getDefaultInstanceForType() {
            return defaultInstance;
        }

        private int bitField0_;
        // optional string Title = 1;
        public static final int TITLE_FIELD_NUMBER = 1;
        private java.lang.Object title_;

        public boolean hasTitle() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        public String getTitle() {
            java.lang.Object ref = title_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    title_ = s;
                }
                return s;
            }
        }

        private com.google.protobuf.ByteString getTitleBytes() {
            java.lang.Object ref = title_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                title_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // repeated .DictResultItem Items = 2;
        public static final int ITEMS_FIELD_NUMBER = 2;
        private java.util.List<Protobuf.Models.DictResultItem> items_;

        public java.util.List<Protobuf.Models.DictResultItem> getItemsList() {
            return items_;
        }

        public java.util.List<? extends Protobuf.Models.DictResultItemOrBuilder>
        getItemsOrBuilderList() {
            return items_;
        }

        public int getItemsCount() {
            return items_.size();
        }

        public Protobuf.Models.DictResultItem getItems(int index) {
            return items_.get(index);
        }

        public Protobuf.Models.DictResultItemOrBuilder getItemsOrBuilder(
                int index) {
            return items_.get(index);
        }

        private void initFields() {
            title_ = "";
            items_ = java.util.Collections.emptyList();
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, getTitleBytes());
            }
            for (int i = 0; i < items_.size(); i++) {
                output.writeMessage(2, items_.get(i));
            }
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(1, getTitleBytes());
            }
            for (int i = 0; i < items_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, items_.get(i));
            }
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Protobuf.Models.DictResultPortion parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.DictResultPortion parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.DictResultPortion parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.DictResultPortion parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.DictResultPortion parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.DictResultPortion parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.DictResultPortion parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.DictResultPortion parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.DictResultPortion parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.DictResultPortion parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Protobuf.Models.DictResultPortion prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends
                com.google.protobuf.GeneratedMessageLite.Builder<
                        Protobuf.Models.DictResultPortion, Builder>
                implements Protobuf.Models.DictResultPortionOrBuilder {
            // Construct using Protobuf.Models.DictResultPortion.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                title_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                items_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Protobuf.Models.DictResultPortion getDefaultInstanceForType() {
                return Protobuf.Models.DictResultPortion.getDefaultInstance();
            }

            public Protobuf.Models.DictResultPortion build() {
                Protobuf.Models.DictResultPortion result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            private Protobuf.Models.DictResultPortion buildParsed()
                    throws com.google.protobuf.InvalidProtocolBufferException {
                Protobuf.Models.DictResultPortion result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(
                            result).asInvalidProtocolBufferException();
                }
                return result;
            }

            public Protobuf.Models.DictResultPortion buildPartial() {
                Protobuf.Models.DictResultPortion result = new Protobuf.Models.DictResultPortion(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.title_ = title_;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    items_ = java.util.Collections.unmodifiableList(items_);
                    bitField0_ = (bitField0_ & ~0x00000002);
                }
                result.items_ = items_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(Protobuf.Models.DictResultPortion other) {
                if (other == Protobuf.Models.DictResultPortion.getDefaultInstance()) return this;
                if (other.hasTitle()) {
                    setTitle(other.getTitle());
                }
                if (!other.items_.isEmpty()) {
                    if (items_.isEmpty()) {
                        items_ = other.items_;
                        bitField0_ = (bitField0_ & ~0x00000002);
                    } else {
                        ensureItemsIsMutable();
                        items_.addAll(other.items_);
                    }

                }
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                while (true) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:

                            return this;
                        default: {
                            if (!parseUnknownField(input, extensionRegistry, tag)) {

                                return this;
                            }
                            break;
                        }
                        case 10: {
                            bitField0_ |= 0x00000001;
                            title_ = input.readBytes();
                            break;
                        }
                        case 18: {
                            Protobuf.Models.DictResultItem.Builder subBuilder = Protobuf.Models.DictResultItem.newBuilder();
                            input.readMessage(subBuilder, extensionRegistry);
                            addItems(subBuilder.buildPartial());
                            break;
                        }
                    }
                }
            }

            private int bitField0_;

            // optional string Title = 1;
            private java.lang.Object title_ = "";

            public boolean hasTitle() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            public String getTitle() {
                java.lang.Object ref = title_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    title_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            public Builder setTitle(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                title_ = value;

                return this;
            }

            public Builder clearTitle() {
                bitField0_ = (bitField0_ & ~0x00000001);
                title_ = getDefaultInstance().getTitle();

                return this;
            }

            void setTitle(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000001;
                title_ = value;

            }

            // repeated .DictResultItem Items = 2;
            private java.util.List<Protobuf.Models.DictResultItem> items_ =
                    java.util.Collections.emptyList();

            private void ensureItemsIsMutable() {
                if (!((bitField0_ & 0x00000002) == 0x00000002)) {
                    items_ = new java.util.ArrayList<Protobuf.Models.DictResultItem>(items_);
                    bitField0_ |= 0x00000002;
                }
            }

            public java.util.List<Protobuf.Models.DictResultItem> getItemsList() {
                return java.util.Collections.unmodifiableList(items_);
            }

            public int getItemsCount() {
                return items_.size();
            }

            public Protobuf.Models.DictResultItem getItems(int index) {
                return items_.get(index);
            }

            public Builder setItems(
                    int index, Protobuf.Models.DictResultItem value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureItemsIsMutable();
                items_.set(index, value);

                return this;
            }

            public Builder setItems(
                    int index, Protobuf.Models.DictResultItem.Builder builderForValue) {
                ensureItemsIsMutable();
                items_.set(index, builderForValue.build());

                return this;
            }

            public Builder addItems(Protobuf.Models.DictResultItem value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureItemsIsMutable();
                items_.add(value);

                return this;
            }

            public Builder addItems(
                    int index, Protobuf.Models.DictResultItem value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureItemsIsMutable();
                items_.add(index, value);

                return this;
            }

            public Builder addItems(
                    Protobuf.Models.DictResultItem.Builder builderForValue) {
                ensureItemsIsMutable();
                items_.add(builderForValue.build());

                return this;
            }

            public Builder addItems(
                    int index, Protobuf.Models.DictResultItem.Builder builderForValue) {
                ensureItemsIsMutable();
                items_.add(index, builderForValue.build());

                return this;
            }

            public Builder addAllItems(
                    java.lang.Iterable<? extends Protobuf.Models.DictResultItem> values) {
                ensureItemsIsMutable();
                super.addAll(values, items_);

                return this;
            }

            public Builder clearItems() {
                items_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000002);

                return this;
            }

            public Builder removeItems(int index) {
                ensureItemsIsMutable();
                items_.remove(index);

                return this;
            }

            // @@protoc_insertion_point(builder_scope:DictResultPortion)
        }

        static {
            defaultInstance = new DictResultPortion(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:DictResultPortion)
    }

    public interface DictResultItemOrBuilder
            extends com.google.protobuf.MessageLiteOrBuilder {

        // optional string Item1 = 1;
        boolean hasItem1();

        String getItem1();

        // optional string Item2 = 2;
        boolean hasItem2();

        String getItem2();

        // optional bool IsQueryEnabled = 3;
        boolean hasIsQueryEnabled();

        boolean getIsQueryEnabled();

        // optional string PreFixed = 4;
        boolean hasPreFixed();

        String getPreFixed();

        // optional string AudioUrl = 5;
        boolean hasAudioUrl();

        String getAudioUrl();

        // optional string AudioSize = 6;
        boolean hasAudioSize();

        String getAudioSize();
    }

    public static final class DictResultItem extends
            com.google.protobuf.GeneratedMessageLite
            implements DictResultItemOrBuilder {
        // Use DictResultItem.newBuilder() to construct.
        private DictResultItem(Builder builder) {
            super(builder);
        }

        private DictResultItem(boolean noInit) {
        }

        private static final DictResultItem defaultInstance;

        public static DictResultItem getDefaultInstance() {
            return defaultInstance;
        }

        public DictResultItem getDefaultInstanceForType() {
            return defaultInstance;
        }

        private int bitField0_;
        // optional string Item1 = 1;
        public static final int ITEM1_FIELD_NUMBER = 1;
        private java.lang.Object item1_;

        public boolean hasItem1() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        public String getItem1() {
            java.lang.Object ref = item1_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    item1_ = s;
                }
                return s;
            }
        }

        private com.google.protobuf.ByteString getItem1Bytes() {
            java.lang.Object ref = item1_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                item1_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional string Item2 = 2;
        public static final int ITEM2_FIELD_NUMBER = 2;
        private java.lang.Object item2_;

        public boolean hasItem2() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        public String getItem2() {
            java.lang.Object ref = item2_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    item2_ = s;
                }
                return s;
            }
        }

        private com.google.protobuf.ByteString getItem2Bytes() {
            java.lang.Object ref = item2_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                item2_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional bool IsQueryEnabled = 3;
        public static final int ISQUERYENABLED_FIELD_NUMBER = 3;
        private boolean isQueryEnabled_;

        public boolean hasIsQueryEnabled() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }

        public boolean getIsQueryEnabled() {
            return isQueryEnabled_;
        }

        // optional string PreFixed = 4;
        public static final int PREFIXED_FIELD_NUMBER = 4;
        private java.lang.Object preFixed_;

        public boolean hasPreFixed() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }

        public String getPreFixed() {
            java.lang.Object ref = preFixed_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    preFixed_ = s;
                }
                return s;
            }
        }

        private com.google.protobuf.ByteString getPreFixedBytes() {
            java.lang.Object ref = preFixed_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                preFixed_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional string AudioUrl = 5;
        public static final int AUDIOURL_FIELD_NUMBER = 5;
        private java.lang.Object audioUrl_;

        public boolean hasAudioUrl() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }

        public String getAudioUrl() {
            java.lang.Object ref = audioUrl_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    audioUrl_ = s;
                }
                return s;
            }
        }

        private com.google.protobuf.ByteString getAudioUrlBytes() {
            java.lang.Object ref = audioUrl_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                audioUrl_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional string AudioSize = 6;
        public static final int AUDIOSIZE_FIELD_NUMBER = 6;
        private java.lang.Object audioSize_;

        public boolean hasAudioSize() {
            return ((bitField0_ & 0x00000020) == 0x00000020);
        }

        public String getAudioSize() {
            java.lang.Object ref = audioSize_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (com.google.protobuf.Internal.isValidUtf8(bs)) {
                    audioSize_ = s;
                }
                return s;
            }
        }

        private com.google.protobuf.ByteString getAudioSizeBytes() {
            java.lang.Object ref = audioSize_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((String) ref);
                audioSize_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private void initFields() {
            item1_ = "";
            item2_ = "";
            isQueryEnabled_ = false;
            preFixed_ = "";
            audioUrl_ = "";
            audioSize_ = "";
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, getItem1Bytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, getItem2Bytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBool(3, isQueryEnabled_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeBytes(4, getPreFixedBytes());
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                output.writeBytes(5, getAudioUrlBytes());
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                output.writeBytes(6, getAudioSizeBytes());
            }
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(1, getItem1Bytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, getItem2Bytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(3, isQueryEnabled_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(4, getPreFixedBytes());
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(5, getAudioUrlBytes());
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(6, getAudioSizeBytes());
            }
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static Protobuf.Models.DictResultItem parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.DictResultItem parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.DictResultItem parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data).buildParsed();
        }

        public static Protobuf.Models.DictResultItem parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return newBuilder().mergeFrom(data, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.DictResultItem parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.DictResultItem parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Protobuf.Models.DictResultItem parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.DictResultItem parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            Builder builder = newBuilder();
            if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
                return builder.buildParsed();
            } else {
                return null;
            }
        }

        public static Protobuf.Models.DictResultItem parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input).buildParsed();
        }

        public static Protobuf.Models.DictResultItem parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return newBuilder().mergeFrom(input, extensionRegistry)
                    .buildParsed();
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(Protobuf.Models.DictResultItem prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        public static final class Builder extends
                com.google.protobuf.GeneratedMessageLite.Builder<
                        Protobuf.Models.DictResultItem, Builder>
                implements Protobuf.Models.DictResultItemOrBuilder {
            // Construct using Protobuf.Models.DictResultItem.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                item1_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                item2_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                isQueryEnabled_ = false;
                bitField0_ = (bitField0_ & ~0x00000004);
                preFixed_ = "";
                bitField0_ = (bitField0_ & ~0x00000008);
                audioUrl_ = "";
                bitField0_ = (bitField0_ & ~0x00000010);
                audioSize_ = "";
                bitField0_ = (bitField0_ & ~0x00000020);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Protobuf.Models.DictResultItem getDefaultInstanceForType() {
                return Protobuf.Models.DictResultItem.getDefaultInstance();
            }

            public Protobuf.Models.DictResultItem build() {
                Protobuf.Models.DictResultItem result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            private Protobuf.Models.DictResultItem buildParsed()
                    throws com.google.protobuf.InvalidProtocolBufferException {
                Protobuf.Models.DictResultItem result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(
                            result).asInvalidProtocolBufferException();
                }
                return result;
            }

            public Protobuf.Models.DictResultItem buildPartial() {
                Protobuf.Models.DictResultItem result = new Protobuf.Models.DictResultItem(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.item1_ = item1_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.item2_ = item2_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.isQueryEnabled_ = isQueryEnabled_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.preFixed_ = preFixed_;
                if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                    to_bitField0_ |= 0x00000010;
                }
                result.audioUrl_ = audioUrl_;
                if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
                    to_bitField0_ |= 0x00000020;
                }
                result.audioSize_ = audioSize_;
                result.bitField0_ = to_bitField0_;
                return result;
            }

            public Builder mergeFrom(Protobuf.Models.DictResultItem other) {
                if (other == Protobuf.Models.DictResultItem.getDefaultInstance()) return this;
                if (other.hasItem1()) {
                    setItem1(other.getItem1());
                }
                if (other.hasItem2()) {
                    setItem2(other.getItem2());
                }
                if (other.hasIsQueryEnabled()) {
                    setIsQueryEnabled(other.getIsQueryEnabled());
                }
                if (other.hasPreFixed()) {
                    setPreFixed(other.getPreFixed());
                }
                if (other.hasAudioUrl()) {
                    setAudioUrl(other.getAudioUrl());
                }
                if (other.hasAudioSize()) {
                    setAudioSize(other.getAudioSize());
                }
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                while (true) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:

                            return this;
                        default: {
                            if (!parseUnknownField(input, extensionRegistry, tag)) {

                                return this;
                            }
                            break;
                        }
                        case 10: {
                            bitField0_ |= 0x00000001;
                            item1_ = input.readBytes();
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            item2_ = input.readBytes();
                            break;
                        }
                        case 24: {
                            bitField0_ |= 0x00000004;
                            isQueryEnabled_ = input.readBool();
                            break;
                        }
                        case 34: {
                            bitField0_ |= 0x00000008;
                            preFixed_ = input.readBytes();
                            break;
                        }
                        case 42: {
                            bitField0_ |= 0x00000010;
                            audioUrl_ = input.readBytes();
                            break;
                        }
                        case 50: {
                            bitField0_ |= 0x00000020;
                            audioSize_ = input.readBytes();
                            break;
                        }
                    }
                }
            }

            private int bitField0_;

            // optional string Item1 = 1;
            private java.lang.Object item1_ = "";

            public boolean hasItem1() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            public String getItem1() {
                java.lang.Object ref = item1_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    item1_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            public Builder setItem1(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                item1_ = value;

                return this;
            }

            public Builder clearItem1() {
                bitField0_ = (bitField0_ & ~0x00000001);
                item1_ = getDefaultInstance().getItem1();

                return this;
            }

            void setItem1(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000001;
                item1_ = value;

            }

            // optional string Item2 = 2;
            private java.lang.Object item2_ = "";

            public boolean hasItem2() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }

            public String getItem2() {
                java.lang.Object ref = item2_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    item2_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            public Builder setItem2(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                item2_ = value;

                return this;
            }

            public Builder clearItem2() {
                bitField0_ = (bitField0_ & ~0x00000002);
                item2_ = getDefaultInstance().getItem2();

                return this;
            }

            void setItem2(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000002;
                item2_ = value;

            }

            // optional bool IsQueryEnabled = 3;
            private boolean isQueryEnabled_;

            public boolean hasIsQueryEnabled() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }

            public boolean getIsQueryEnabled() {
                return isQueryEnabled_;
            }

            public Builder setIsQueryEnabled(boolean value) {
                bitField0_ |= 0x00000004;
                isQueryEnabled_ = value;

                return this;
            }

            public Builder clearIsQueryEnabled() {
                bitField0_ = (bitField0_ & ~0x00000004);
                isQueryEnabled_ = false;

                return this;
            }

            // optional string PreFixed = 4;
            private java.lang.Object preFixed_ = "";

            public boolean hasPreFixed() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }

            public String getPreFixed() {
                java.lang.Object ref = preFixed_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    preFixed_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            public Builder setPreFixed(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                preFixed_ = value;

                return this;
            }

            public Builder clearPreFixed() {
                bitField0_ = (bitField0_ & ~0x00000008);
                preFixed_ = getDefaultInstance().getPreFixed();

                return this;
            }

            void setPreFixed(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000008;
                preFixed_ = value;

            }

            // optional string AudioUrl = 5;
            private java.lang.Object audioUrl_ = "";

            public boolean hasAudioUrl() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }

            public String getAudioUrl() {
                java.lang.Object ref = audioUrl_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    audioUrl_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            public Builder setAudioUrl(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000010;
                audioUrl_ = value;

                return this;
            }

            public Builder clearAudioUrl() {
                bitField0_ = (bitField0_ & ~0x00000010);
                audioUrl_ = getDefaultInstance().getAudioUrl();

                return this;
            }

            void setAudioUrl(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000010;
                audioUrl_ = value;

            }

            // optional string AudioSize = 6;
            private java.lang.Object audioSize_ = "";

            public boolean hasAudioSize() {
                return ((bitField0_ & 0x00000020) == 0x00000020);
            }

            public String getAudioSize() {
                java.lang.Object ref = audioSize_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
                    audioSize_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            public Builder setAudioSize(String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000020;
                audioSize_ = value;

                return this;
            }

            public Builder clearAudioSize() {
                bitField0_ = (bitField0_ & ~0x00000020);
                audioSize_ = getDefaultInstance().getAudioSize();

                return this;
            }

            void setAudioSize(com.google.protobuf.ByteString value) {
                bitField0_ |= 0x00000020;
                audioSize_ = value;

            }

            // @@protoc_insertion_point(builder_scope:DictResultItem)
        }

        static {
            defaultInstance = new DictResultItem(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:DictResultItem)
    }


    static {
    }

    // @@protoc_insertion_point(outer_class_scope)
}
