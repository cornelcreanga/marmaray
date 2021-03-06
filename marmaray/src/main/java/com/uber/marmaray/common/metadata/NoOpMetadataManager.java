/*
 * Copyright (c) 2018 Uber Technologies, Inc.
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions
 * of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO
 * THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */
package com.uber.marmaray.common.metadata;

import com.google.common.base.Optional;
import com.uber.marmaray.common.metrics.DataFeedMetrics;
import com.uber.marmaray.common.metrics.JobMetrics;
import lombok.NonNull;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.IOException;
import java.util.Collections;
import java.util.Set;

public class NoOpMetadataManager implements IMetadataManager<StringValue> {

    @Override
    public void setDataFeedMetrics(@NonNull final DataFeedMetrics dataFeedMetrics) {
    }

    @Override
    public void setJobMetrics(@NonNull final JobMetrics jobMetrics) {
    }

    @Override
    public void set(@NotEmpty final String key, @NonNull final StringValue value) {
        // no-op
    }

    @Override
    public Optional<StringValue> remove(@NotEmpty final String key) {
        return Optional.absent();
    }

    @Override
    public Optional<StringValue> get(@NotEmpty final String key) {
        return Optional.absent();
    }

    @Override
    public void saveChanges() throws IOException {
        //no-op
    }

    @Override
    public Set<String> getAllKeys() {
        return Collections.emptySet();
    }
}
