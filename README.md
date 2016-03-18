# DeckView
A ViewGroup that mimics Android (Lollipop) Recent apps screen layout.

######Note by vikramkakkar:
DeckView is **not** a true recycler. It *does* recycle views - but it also updates progress map for *all* of its children on each scroll step. This will result in lags with large datasets.

# Forked from
    https://github.com/vikramkakkar/DeckView

# Origin from
    https://android.googlesource.com/platform/frameworks/base/+/4f9482d/packages/SystemUI/src/com/android/systemui/recents

# License
Copyright (C) 2016 Zheng Li <https://lizheng.me>
Copyright (C) 2014 The Android Open Source Project

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.