import FetcherBridge from './NetBridge';

const timeout = 60000;

function filterJSON(res) {
    try {

        console.debug(res);
        return res.text();
    } catch (e) {
        throw new Error('data format error');
    }
}

function filterData(result) {
    try {
        return (JSON.parse(result)).data;
    } catch (e) {
        throw new Error(e);
    }
}

function filterPageData(result) {
    try {
        let json = JSON.parse(result);
        return {
            recordCount: ~~(json.recorCount),
            pageCount: ~~(json.pageCount || 1),
            pageSize: ~~(json.pageSize || 10),
            pageIndex: ~~~~(json.pageIndex || 1),
            list: json.data || []
        }
    } catch (e) {
        throw new Error(e);
    }
}

function timeoutFetch(ms, promise) {
    return new Promise((resolve, reject) => {
        const timer = setTimeout(() => {
            reject(new Error("fetch time out"));
        }, ms);
        promise.then(
            (res) => {
                clearTimeout(timer);
                resolve(res);
            },
            (err) => {
                clearTimeout(timer);
                reject(err);
            }
        );
    })
}

export async function fetcherTodaySentence() {
    let result = await FetcherBridge.fetchSentence();
    try {
        let json = JSON.parse(result);
        console.debug(json);
        return json.dataListList;
    } catch (e) {
        throw new Error(e);
    }
}

// export function fetcherReaderList(category, pageIndex) {
//     let condition = { ParentId: category, PageSize: 10, PageIndex: pageIndex };
//     return fetcherPost('/ReaderList', condition).then(filterPageData);
// }

// export function fetcherReaderDetail(id) {
//     return fetcherGet('/ReaderDetail/' + id).then(filterData);
// }

// export function fetcherBookCategoryList() {
//     return fetcherGet('/BookCategoryList').then(filterData);
// }

// export function fetcherBookList(category, pageIndex) {
//     let condition = { ParentId: category, PageSize: 10, PageIndex: pageIndex };
//     return fetcherPost('/BookList', condition).then(filterPageData);
// }

// export function fetcherBookDetail(id) {
//     return fetcherGet('/BookDetail/' + id).then(filterData);
// }

// export function fetcherChapterList(bookId, pageIndex) {
//     let condition = { ParentId: bookId, PageSize: 10, PageIndex: pageIndex };
//     return fetcherPost('/ChapterList', condition).then(filterPageData);
// }